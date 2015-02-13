package org.tilegames.hexicube.cah.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
//import java.math.BigInteger;
import java.net.Socket;
/*import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;*/
import java.security.cert.X509Certificate;
import java.util.Date;
//import java.util.Date;
import java.util.Iterator;
//import java.util.Set;
import java.util.regex.Pattern;

import javax.net.SocketFactory;

import com.google.gson.*;
import com.sun.net.ssl.SSLContext;
//import com.sun.net.ssl.TrustManager;
//import com.sun.net.ssl.TrustManagerFactory;
import com.sun.net.ssl.X509TrustManager;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

@SuppressWarnings("deprecation")
public class CardCastDeck extends Deck
{
	private String deckName, shortDeckName;
	private Card[] callCards, responseCards;
	
	public boolean deckLoaded, deckValid;
	
	public CardCastDeck(byte[] data)
	{
		fromBytes(new ByteInputStream(data, data.length));
	}
	
	public CardCastDeck(String identifier, final boolean forceUpdate)
	{
		System.out.println("Acquiring new CardCast deck: "+identifier);
		shortDeckName = identifier;
		new Thread(new Runnable(){
			@Override
			public void run()
			{
				if(shortDeckName == null) return;
				if(!Pattern.matches("^(A-Z0-9)[5]$", shortDeckName)) return; //TODO: throw errors for the UI
				
				if(!forceUpdate)
				{
					try
					{
						File f = new File("cardcast/"+shortDeckName+".deck");
						if(f.exists() && f.isFile())
						{
							FileInputStream in = new FileInputStream(f);
							fromBytes(in);
							in.close();
							if(deckLoaded && deckValid)
							{
								System.out.println("\tDeck already on system.");
								return;
							}
						}
					}
					catch(Exception e){}
				}
				try
				{
					SSLContext context = SSLContext.getInstance("TLS");
					context.init(null, new X509TrustManager[]{
						new X509TrustManager(){
							/*private X509TrustManager parent;
							private X509Certificate startComCert;
							
							private void findParent() throws Exception
							{
								TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm()); 
								trustManagerFactory.init(null);
								
								for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) { 
								    if (trustManager instanceof X509TrustManager) {
								        parent = (X509TrustManager)trustManager;
								        break;
								    }
								}
							}
							
							private void loadStartComCert() throws Exception
							{
								InputStream inStream = new FileInputStream("startcom.cert");
								CertificateFactory cf = CertificateFactory.getInstance("X.509");
								startComCert = (X509Certificate)cf.generateCertificate(inStream);
								inStream.close();
							}*/
							
							@Override
							public X509Certificate[] getAcceptedIssuers()
							{
								/*if(parent == null)
								{
									try
									{
										findParent();
									}
									catch(Exception e)
									{
										e.printStackTrace();
									}
								}
								if(parent == null) return new X509Certificate[0];
								if(startComCert == null)
								{
									try
									{
										loadStartComCert();
									}
									catch(Exception e)
									{
										e.printStackTrace();
									}
								}
								if(startComCert == null) return parent.getAcceptedIssuers();
								X509Certificate[] certs = parent.getAcceptedIssuers();
								X509Certificate[] newCerts = new X509Certificate[certs.length+1];
								for(int a = 0; a < certs.length; a++) newCerts[a] = certs[a];
								newCerts[certs.length] = startComCert;
								return newCerts;*/
								return new X509Certificate[0];
							}
							@Override
							public boolean isClientTrusted(X509Certificate[] arg0)
							{
								/*if(parent == null)
								{
									try
									{
										findParent();
									}
									catch(Exception e)
									{
										e.printStackTrace();
									}
								}
								if(parent == null) return true;
								return parent.isClientTrusted(arg0);*/
								return true;
							}
							@Override
							public boolean isServerTrusted(X509Certificate[] arg0)
							{
								/*if(parent == null)
								{
									try
									{
										findParent();
									}
									catch(Exception e)
									{
										e.printStackTrace();
									}
								}
								if(parent == null) return true;
								return parent.isServerTrusted(arg0);*/
								return true;
							}
						}
					}, null);
					SocketFactory socketFactory = context.getSocketFactory();
					
					System.out.println("\tConnecting to CardCast...");
					Socket socket = socketFactory.createSocket("api.cardcastgame.com", 443);
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("GET /v1/decks/"+shortDeckName+" HTTP/1.1");
					out.println("Host: api.cardcastgame.com");
					out.println("Connection: close");
					out.println("User-Agent: Custom");
					out.println();
					out.println();
					System.out.println("\tRequested deck data...");
					String data = "";
					boolean hitEmptyLine = false;
					while(true)
					{
						String inLine = in.readLine();
						if(inLine == null) break;
						if(hitEmptyLine) data += inLine;
						if(inLine.equals("")) hitEmptyLine = true;
					}
					socket.close();
					System.out.println("\tDeck data received.");
					
					JsonParser parser = new JsonParser();
					JsonObject deckData = parser.parse(data).getAsJsonObject();
					if(!deckData.has("code")) throw new Exception("CardCast deck invalid: "+deckData.get("message").getAsString());
					deckName = deckData.get("name").getAsString();
					shortDeckName = deckData.get("code").getAsString();
					callCards = new Card[deckData.get("call_count").getAsInt()];
					responseCards = new Card[deckData.get("response_count").getAsInt()];
					
					System.out.println("\tRequested deck cards...");
					socket = socketFactory.createSocket("api.cardcastgame.com", 443);
					in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					out = new PrintWriter(socket.getOutputStream(), true);
					out.println("GET /v1/decks/"+shortDeckName+"/cards HTTP/1.1");
					out.println("Host: api.cardcastgame.com");
					out.println("Connection: close");
					out.println("User-Agent: Custom");
					out.println();
					out.println();
					data = "";
					int hitEmptyLine2 = 0;
					while(true)
					{
						String inLine = in.readLine();
						if(inLine == null) break;
						if(hitEmptyLine2 == 2) data += inLine;
						if(inLine.equals("")) hitEmptyLine2 = 1;
						else if(hitEmptyLine2 > 0) hitEmptyLine2++;
					}
					socket.close();
					System.out.println("\tDeck cards received.");
					
					JsonObject deckCards = parser.parse(data).getAsJsonObject();
					if(callCards.length > 0)
					{
						System.out.println("\tParsing call cards...");
						JsonArray cards = deckCards.get("calls").getAsJsonArray();
						for(int a = 0; a < callCards.length; a++)
						{
							JsonArray arr = cards.get(a).getAsJsonObject().get("text").getAsJsonArray();
							String text = "";
							Iterator<JsonElement> iter = arr.iterator();
							while(iter.hasNext())
							{
								String next = iter.next().getAsString();
								if((!text.equals("") && !text.equals("_")) || next.equals("")) text += "_";
								text += next;
							}
							callCards[a] = new Card(text);
						}
					}
					if(responseCards.length > 0)
					{
						System.out.println("\tParsing response cards...");
						JsonArray cards = deckCards.get("responses").getAsJsonArray();
						for(int a = 0; a < responseCards.length; a++)
						{
							String text = cards.get(a).getAsJsonObject().get("text").getAsString();
							responseCards[a] = new Card(text);
						}
					}
					deckValid = true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				lastUpdate = new Date();
				deckLoaded = true;
				saveToFile();
			}
		}).start();
	}
	
	@Override
	public String getDeckName()
	{
		return deckName;
	}
	
	@Override
	public String getShortDeckName()
	{
		return shortDeckName;
	}
	
	@Override
	public boolean officialDeck()
	{
		return false;
	}
	
	public boolean cardCastDeckLoaded()
	{
		return deckLoaded;
	}
	
	public boolean cardCastDeckValid()
	{
		return deckValid;
	}
	
	@Override
	public int numCallCards()
	{
		return (callCards==null)?0:callCards.length;
	}
	
	@Override
	public int numResponseCards()
	{
		return (responseCards==null)?0:responseCards.length;
	}
	
	@Override
	public Card[] getCallCards()
	{
		return callCards;
	}
	
	@Override
	public Card[] getResponseCards()
	{
		return responseCards;
	}
	
	public void toBytes(OutputStream out)
	{
		try
		{
			IOHelper.writeString(out, deckName);
			IOHelper.writeString(out, shortDeckName);
			IOHelper.writeInt(out, callCards.length);
			for(Card c : callCards)
			{
				IOHelper.writeString(out, c.getCardText());
			}
			IOHelper.writeInt(out, responseCards.length);
			for(Card c : responseCards)
			{
				IOHelper.writeString(out, c.getCardText());
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private void fromBytes(InputStream in)
	{
		deckLoaded = false;
		deckValid = false;
		try
		{
			deckName = IOHelper.readString(in);
			shortDeckName = IOHelper.readString(in);
			int size = IOHelper.readInt(in);
			callCards = new Card[size];
			for(int a = 0; a < size; a++)
			{
				callCards[a] = new Card(IOHelper.readString(in));
			}
			size = IOHelper.readInt(in);
			responseCards = new Card[size];
			for(int a = 0; a < size; a++)
			{
				responseCards[a] = new Card(IOHelper.readString(in));
			}
			deckValid = true;
			deckLoaded = true;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			deckLoaded = true;
		}
	}
	
	private void saveToFile()
	{
		try
		{
			File f = new File("cardcast/"+getShortDeckName()+".deck");
			f.getParentFile().mkdirs();
			if(f.exists() && f.isFile()) f.delete();
			f.createNewFile();
			FileOutputStream out = new FileOutputStream(f);
			toBytes(out);
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private Date lastUpdate;
	public Date getLastUpdated()
	{
		return lastUpdate;
	}
}