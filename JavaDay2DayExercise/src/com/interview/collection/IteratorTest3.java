package com.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class IteratorTest3 {
 public static void main(String[] args) {
	 
	CopyOnWriteArraySet<Integer> al=new CopyOnWriteArraySet<>();
	for(int i=0;i<=10;i++) {
		al.add(i);
	}
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext()) {
		Integer i=(Integer)itr.next();
	if(i%2!=0) {
		itr.remove();
	}
	
	}
	System.out.println(al);
}
}
//Output: UnsupportedOperationException