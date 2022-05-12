package com.chainsys.collections;

import java.util.Iterator;
import java.util.ArrayDeque;



public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> arraydeque = new ArrayDeque<String>();
		//use an ArrayDeque like A stack.
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X");//duplicate value
		arraydeque.push("Z");//duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
	//	System.out.println("Before popping the stack: " +arraydeque.size());
	//	while(arraydeque.peek() != null)
	//		System.out.println(arraydeque.pop() + " ");
	//	System.out.println("After Popping the Stack: " +arraydeque.size());
		Iterator<String> iterator =arraydeque.iterator();
		while (iterator.hasNext())
		{
			System.out.println("\t " +iterator.next());
		}
		Iterator<String> striterator = arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.println("\t" +striterator.next());
		}
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator = arraydeque.iterator();
		while(iterator.hasNext()) {
			System.out.println("\t" +iterator.next());
		}
		//pollFirst
		//Retrieves and removes the first element of this deque,or returns null if this deque is empty
		System.out.println("**************pollfirst: "+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("**************pollLast: " +arraydeque.pollLast());
		System.out.println(arraydeque);
		//
		//peekfirst
		//retrieves ,but does not remove,the first element of thius deque,or returns null if this deque is empty
		System.out.println("**********peekFirst: " +arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("**********peeklast:" +arraydeque.peekLast());
		System.out.println(arraydeque);
		//removefirst
		//retrieves and removes the first element of this deque.
		//if this deque is empty.
		System.out.println("**********Removefirst: " +arraydeque.removeFirst());
		System.out.println(arraydeque); 
		System.out.println("**********Removelast:" +arraydeque.removeLast());
		System.out.println(arraydeque);
		///
		System.out.println("**********RemovefirstOccurence: X " +arraydeque.removeFirstOccurrence("X"));
		System.out.println(arraydeque);
		System.out.println("**********RemovelastOccurence:  Z " +arraydeque.removeLastOccurrence("Z"));
		System.out.println(arraydeque);

		


	}

}
