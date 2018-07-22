package com.interview.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort2 {

	public static void main(String[] args) {
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		Employee s1=new Employee(10,"Rahi",34);
		Employee s2=new Employee(22,"Chaman",32);
		Employee s3=new Employee(11,"Sahil",28);
		Employee s4=new Employee(40,"Aman",24);
		Employee s5=new Employee(53,"Naman",22);
		 
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 al.add(s4);
		 al.add(s5);

		 Collections.sort(al, new AgeComparator());
		 for(Employee s:al) {
			 System.out.println(s.id+" "+s.name+" "+s.age);
		 }
		 
	}
}
