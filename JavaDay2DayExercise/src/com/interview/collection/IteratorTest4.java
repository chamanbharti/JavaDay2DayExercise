package com.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest4 {
 public static void main(String[] args) {
	 
	 CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
	for(int i=0;i<=10;i++) {
		al.add(i);
	}
	ListIterator<Integer>itr=al.listIterator();
	while(itr.hasNext()) {
		Integer i=(Integer)itr.next();
	if(i%2!=0) {
		itr.remove();
	}
	
	}
	System.out.println(al);
}
}
//Output: [0, 2, 4, 6, 8, 10]