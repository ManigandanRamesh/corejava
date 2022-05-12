package com.chainsys.threads;

public class TestRunnableWorker {
	public static void main(String[] args) {
		runningMultipleRunnableThreads();
		//multiThreadsonjoin();
		//exitingMultiThreads();
		//workingThreadPriority();
		//checkingStateofThreads();
	}
	
	public static void runningMultipleRunnableThreads()
	{
		try
		  {
			Thread t=Thread.currentThread();
			System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker firstWorker=new RunnableWorker();
			//RunnableWorker secondWorker=new RunnableWorker();
			Thread t1=new Thread(firstWorker);
			//Thread t2=new Thread(secondWorker);
			Thread t2=new Thread(firstWorker);
			t1.start();//call run
			t2.start();//call run
			System.out.println("From Main--END!!!");
		 }
catch(Exception e)
		 {
			 System.out.println("ERROR!!! "+e.getMessage());
	     }
	}
	
	public static void multiThreadsonjoin()
	{
		try
		  {
			Thread t=Thread.currentThread();
			System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker firstWorker=new RunnableWorker();
			Thread t1=new Thread(firstWorker);
			Thread t2=new Thread(firstWorker);
			t1.start();//call run
			t2.start();// call run		
			t1.join();
			t2.join();
			System.out.println("From Main--END!!!");
		 }catch(Exception e)
		 {
			 System.out.println("ERROR!!! "+e.getMessage());
	     }
	}
	
	public static void exitingMultiThreads()
	{
		 try
		  {
			RunnableWorker obj=new RunnableWorker();
			Thread t1=new Thread(obj);
			Thread t2=new Thread(obj);
			t1.start();//call run
			t2.start();// call run
			t1.join(400);
			t2.join(200);
			System.out.println("From Main AMT: " + obj.amount);			
		 }
catch(Exception e)
		 {
			 System.out.println(e.getMessage());
	     }
		  finally
		  {
			  System.out.println("Inside Finally");
			  Runtime rt=Runtime.getRuntime();
			  rt.exit(0);
		  }
	}
	
	public static void workingThreadPriority()
	{
		try {
			Thread t = Thread.currentThread();
			System.out.println("MainTh ID: " + t.getId());
			RunnableWorker obj = new RunnableWorker();
			Thread t1 = new Thread(obj);
			Thread t2 = new Thread(obj);
			System.out.println("t1 ID: " + t1.getId());
			System.out.println("t2 ID: " + t2.getId());
			
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
//			t1.setPriority(Thread.MAX_PRIORITY);
//			t2.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("From Main End " + obj.amount);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void checkingStateofThreads()
	{
		RunnableWorker obj=new RunnableWorker();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		System.out.println(t1.getId()+" T1 State "+t1.getState());
		System.out.println(t2.getId()+" T2 State "+t2.getState());
			t1.start();
			t2.start();
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());
		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());  	
		try {
			t1.join();
		  	t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());
}
}


