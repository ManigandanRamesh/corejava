package com.chainsys.usingFinal;

public class Phone {
	public void makeACall()
	{
		System.out.println("Call made....");
	}
	public final void sendSMS() {
		System.out.println("SMS send....");
	}
}
class Nokia extends Phone
{
	public void makeACall()
	{
		System.out.println("call made from Nokia");
	}
//@Override
	//public void sendSMS()
	//{
	//    System.out.println("SMS send...");
	//}

}
