package com.interview.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<Student>al=new ArrayList<Student>();
		Student s1=new Student(10,"Rahi",34);
		Student s2=new Student(22,"Chaman",32);
		Student s3=new Student(11,"Sahil",28);
		Student s4=new Student(40,"Aman",24);
		Student s5=new Student(53,"Naman",22);
		 
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 al.add(s4);
		 al.add(s5);

		 Collections.sort(al);
		 for(Student s:al) {
			 System.out.println(s.id+" "+s.name+" "+s.age);
		 }
		 
	}
}
