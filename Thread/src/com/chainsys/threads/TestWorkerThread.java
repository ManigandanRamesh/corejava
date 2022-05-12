package com.chainsys.threads;
	public class TestWorkerThread {
		public static void main(String[] args) {
			Thread t1=Thread.currentThread();
			try
			{
				System.out.println("Th ID: " +t1.getId() );
				WorkerThread t2=new WorkerThread();
				WorkerThread t3=new WorkerThread();
				t2.start(); 
				t3.start();			
				System.out.println("End of Main Th ID: " +t1.getId() );
			}catch(Exception err){
				System.out.println(err.getMessage());
			}		
		}
	}


