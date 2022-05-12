package com.chainsys.bytestream;
import java.io.ByteArrayInputStream;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="99% is approx equal to 100 but this is &approx; not equal to 95 ";
		byte buf[]=s.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		BufferedInputStream f= new BufferedInputStream(in);
		int c;
		try
		{
			while((c=f.read())!=-1)
			{
				System.out.print((char) c);
			}
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}

	}

}
