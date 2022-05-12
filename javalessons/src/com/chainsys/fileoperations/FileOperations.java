package com.chainsys.fileoperations;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		createnewfile();
		//Readfile();
		//copyfile();
		// Renamefile();
		//deletefile();
		//appendfile();
		//movefile();
		//modifyfile();

	}
public static void createnewfile() {
	
	String path="D:/Oraclelessons/new.txt";
	File file = new File(path);


		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("file is created");
			}
			else {
				System.out.println("this file is already exist");
			}

			
		}catch(IOException err) {
			err.printStackTrace();
		}
			
	 }
public static void Readfile() {
	String path = "D://Oraclelessons//new.txt";
	Scanner sc = null;
	try {
		File test = new File(path);
		sc = new Scanner(test);
		System.out.println("File Content is:");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
	}
	catch(Exception err)
	{
		err.printStackTrace();
	}
	finally {
		sc.close();
	}
}
public static void copyfile() {
	File file =new File("D://Oraclelessons//pdf//sql.pdf");
	File copfile =new File("D://Oraclelessons//pdf//sql-copy.pdf");
	
	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;
	
	try {
		fileInputStream = new FileInputStream(file);
		fileOutputStream = new FileOutputStream(copfile);
		
	}catch(FileNotFoundException err) {
		err.printStackTrace();
	}
	try {
		System.out.println(fileInputStream.available());
	}catch(IOException err) {
		err.printStackTrace();
	}
	int i=0;
	try {
		while((i=fileInputStream.read())!=-1){
			fileOutputStream.write(i);
		} 
		}catch (IOException err) {
			err.printStackTrace();
		}
	finally {
		if(fileInputStream != null) {
			try {
				fileOutputStream.close();
			} catch (IOException err) {
				err.printStackTrace();
			}
		}
		if(fileOutputStream != null) {
			try {
				fileOutputStream.close();
			} catch (IOException err) {
				err.printStackTrace();
	}
	
		}
	}
}
public static void Renamefile() {
	File A = new File("D://temp//new.txt");
	File B = new File("D://temp//content.txt");
	
	boolean frename = A.renameTo(B);
	if(frename) {
		System.out.println("filename is renamed");
	}
	else {
		System.out.println("filename is not renamed...some error occuring....");
	}
}
public static void deletefile() {
	File F = new File ("D:/Oraclelessons/pdf/sql-copy.pdf");
	if(F.delete())
	{
		System.out.println("file deleted successfully");
	}
	else {
		System.out.println("delete file process is some problem");
	}
}
public static void appendfile()
{
	 
	  String data="Today is good day ";
      try
      {
          FileWriter output=new FileWriter("D://temp//content.txt");
          output.write(data);
          System.out.println("The data you gave is appended to your text file");
          output.close();
      }
      catch(Exception e)
      {
           System.out.println("ERROR");
      }
  
}
public static void movefile() {
	 
	 String fromFile=("D://Oraclelessons//pdf//sql.pdf");
     String toFile=("D://Oraclelessons//pdf//New folder//sql.pdf");
     Path source=Paths.get(fromFile);
     Path target=Paths.get(toFile);
     try
     {
       java.nio.file.Files.move(source, target);
       System.out.println("File is  moved to ur folder");
     }
     catch(IOException e)
     {
         e.printStackTrace();
     }


}
public static void modifyfile() throws IOException {
	 String filePath = ("D://temp//content.txt");
     Scanner sc = new Scanner(new File(filePath));
     StringBuffer buffer = new StringBuffer();
     while (sc.hasNextLine()) {
        buffer.append(sc.nextLine()+System.lineSeparator());
     }
     String fileContents = buffer.toString();
     System.out.println("Contents of the file: "+fileContents);
     sc.close();
     String oldLine = "good";
     String newLine = "bad";
     fileContents = fileContents.replaceAll(oldLine, newLine);
     FileWriter writer = new FileWriter(filePath);
     System.out.println("");
     System.out.println("new data: "+fileContents);
     writer.append(fileContents);
     writer.flush();
	
}

}
