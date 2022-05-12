package com.chainsys.abstractclass;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           demoA();
	}
	public static void demoA()
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("cut");
		ts.add("fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("dog");
		ts.add("aag");
		ts.add("AAg");
		ts.add("Event");
		ts.add("Fan");
		//ts.add(null);
		ts.add("delhi");
		ts.add("Carrot");
		ts.add("dall");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("Fool");
		System.out.println("Size " +ts.size());
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
