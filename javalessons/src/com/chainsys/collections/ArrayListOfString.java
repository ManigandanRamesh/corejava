package com.chainsys.collections;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayListOfString {
	public static void usingStringArrayList()
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        System.out.println("Initial size of stringArrayList : "+stringArrayList.size());
        try 
        {
            stringArrayList.add("Car");
            stringArrayList.add("Auto");
            stringArrayList.add("Egg");
            stringArrayList.add("Box");
            stringArrayList.add("Doll");
            stringArrayList.add("Fan");
            // will insert a new value
            // Pushing the current value of index 1 to the next index
            stringArrayList.add(1, "Animal");
            stringArrayList.add("Girl");
            stringArrayList.add("Fan");
            System.out.println("Size of stringArrayList after additions : "+stringArrayList.size());
            System.out.println("Contents of stringArrayList :"+stringArrayList);
            // Will replace the value in index 2
            stringArrayList.set(2, "Xenas");
            System.out.println("After set (2) : "+stringArrayList);
            System.out.println("Last Index of : 'Fan' "+stringArrayList.lastIndexOf("Fan"));
            
            // Remove the first instance of "Fan"
            stringArrayList.remove("Fan");
            stringArrayList.remove(2);
            System.out.println("Size after remove(2) :"+stringArrayList.size());
            System.out.println("Contents of stringArrayList :"+stringArrayList);
            // Will reduce the capacity
            stringArrayList.trimToSize();
        } catch (Exception err) {
        	System.out.println(err.getMessage());
        }

    }
}
