package com.chainsys.bytestream;

import java.io.IOException;

public class ReadUsingByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int c=0;
		        System.out.println("Enter a Character,'q' to quit.");
		        do {
		            try {
		                c=System.in.read();
		                System.out.println(c+"-"+(char)c);
		            }catch(IOException err) {
		                err.printStackTrace();
		            }catch(Exception err) {
		                err.printStackTrace();
		            }
		        }while(c !=(int)'q');
		        
		        System.out.println("******************Exit");        
		    }
		

	}


