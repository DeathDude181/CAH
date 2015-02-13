package org.tilegames.hexicube.cah.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOHelper
{
	public static byte[] readBytes(InputStream in, int len) throws IOException
	{
		byte[] data = new byte[len];
		int pos = 0;
		while(pos < len)
		{
			int readSize = in.read(data, pos, len-pos);
			if(readSize == -1) throw new IOException("EOF");
			pos += readSize;
		}
		return data;
	}
	
	public static void writeBytes(OutputStream out, byte[] data) throws IOException
	{
		out.write(data);
	}
	
	public static int readByte(InputStream in) throws IOException
	{
		int val = in.read();
		if(val == -1) throw new IOException("EOF");
		return val;
	}
	
	public static void writeByte(OutputStream out, int val) throws IOException
	{
		out.write(val);
	}
	
	public static int readShort(InputStream in) throws IOException
	{
		return (readByte(in) << 8) + readByte(in);
	}
	
	public static void writeShort(OutputStream out, int val) throws IOException
	{
		out.write(val >> 8);
		out.write(val);
	}
	
	public static int readInt(InputStream in) throws IOException
	{
		return (readByte(in) << 24) + (readByte(in) << 16) + (readByte(in) << 8) + readByte(in);
	}
	
	public static void writeInt(OutputStream out, int val) throws IOException
	{
		out.write(val >> 24);
		out.write(val >> 16);
		out.write(val >> 8);
		out.write(val);
	}
	
	public static String readString(InputStream in) throws IOException
	{
		int len = readShort(in);
		byte[] data = readBytes(in, len);
		return new String(data, "UTF-8");
	}
	
	public static void writeString(OutputStream out, String val) throws IOException
	{
		byte[] data = val.getBytes("UTF-8");
		writeShort(out, data.length);
		writeBytes(out, data);
	}
}