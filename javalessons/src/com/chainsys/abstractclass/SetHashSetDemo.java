package com.chainsys.abstractclass;

import java.util.HashSet;
import java.util.Iterator;

import com.chainsys.collections.Emp;

public class SetHashSetDemo {
	public static void main(String[]args) {
		demoB();
		
	}
	public static void demoA() {
		HashSet<String> string_hs = new HashSet<String>();
		string_hs.add("Bee");
		string_hs.add("Apple");
		string_hs.add("Doll");
		string_hs.add(null);
		string_hs.add("Egg");
		string_hs.add("Cinema");
		string_hs.add("fan");
		System.out.println("Size " +string_hs.size());
	}
	public static void demoB()
	{
		HashSet<Emp> hs = new HashSet<Emp>();
		Emp e1=null;
		for (int i=0;i<10;i++)
		{
			e1=new Emp(i);
			e1.Name="Emp "+i;
			hs.add(e1);
			
		}
		System.out.println("Count " +hs.size());
		e1 = new Emp(9);
		hs.add(e1);//does not add duplicate Object.ignore
		System.out.println("Count " + hs.size());
		
		Iterator<Emp> itr = hs.iterator();
		while(itr.hasNext())
		{
			Emp e2=itr.next();
			System.out.println(e2.getID() + " " +e2.Name);
		}
	}

}
