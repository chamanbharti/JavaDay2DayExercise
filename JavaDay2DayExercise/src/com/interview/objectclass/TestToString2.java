package com.interview.objectclass;

import java.util.ArrayList;

public class TestToString2 {

	public String toString() {
		return "Test";
	}
	public static void main(String[] args) {
		String s = new String("Chaman");
		System.out.println(s);//Chaman
		Integer i = new Integer(10);
		System.out.println(i);//10
		ArrayList<String> al = new ArrayList<>();
		al.add("Chaman");
		al.add("Bharti");
		System.out.println(al);//[Chaman, Bharti]
		TestToString2 t = new TestToString2();
		System.out.println(t);
		
	}
}
