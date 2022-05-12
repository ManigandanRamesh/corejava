package com.chainsys.threads;


	public class RunnableWorker implements Runnable
	{
	    public int amount=0;
	    public void run()
	    {
	        callme();
	    }
	    public synchronized void callme()
	    {
	      long id=Thread.currentThread().getId();
	      amount=0;
	      System.out.println("Inside callme ThreadID "+id+" Amount "+amount);
	      try{
	       for(int i=0;i<5;i++)
	       {
	        amount+=i;
	        System.out.println(id+ "  " + amount);
	        Thread.sleep(1000);
	         }
	      }catch(Exception e)
	      {
	          System.out.println(e.getMessage());
	      }
	    }
	}


