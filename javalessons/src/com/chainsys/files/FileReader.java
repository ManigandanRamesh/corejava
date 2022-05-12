package com.chainsys.files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charfromfile;
		FileInputStream fin=null;
		String fname="D:\\Oraclelessons\\mani.txt";
		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
			return;
		}
		//checking if data is available
		try
		{
			System.out.println("Is Data Available" +fin.available());
		}
		catch(IOException e) {
			System.out.println("File is closed " +e.getMessage());
			//reading data from the file
			try
			{
				do
				{
					charfromfile = fin.read();
					if(charfromfile != -1)System.out.print((char) charfromfile);
				} while(charfromfile != -1);
			}catch(IOException e1)
			{
				System.out.println("Error in read" +e.getMessage());
			}
			finally
			{
				try
				{
					if(null!=fin)  fin.close();
				}catch(IOException e1)
				{
					System.out.println(e1.getMessage());
				}
			}
		}

	}

}
