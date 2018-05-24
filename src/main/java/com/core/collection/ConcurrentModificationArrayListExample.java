package com.core.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationArrayListExample {
 
    public static void main(String[] args) {
    	CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
       list.add("a");
        list.add("b");
        list.add("c");
       
        Iterator<String> iterator = list.iterator();
       
        while(iterator.hasNext()){
         
         String str = iterator.next();
         System.out.print(str+" ");
         
       //  if(str.equals("b"))
        	    //will throw ConcurrentModificationException
        	 list.add("e");
        }
       
        System.out.println("\nAfter iteration list is : "+list);
       
    }
 
}