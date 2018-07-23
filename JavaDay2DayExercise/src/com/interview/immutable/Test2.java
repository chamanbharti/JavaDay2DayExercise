package com.interview.immutable;

import java.util.HashMap;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

final class Emp2{
	private final int id;
	private final String name;
	private final HashMap<String, String>testMap;
	
	//getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	//Accessor function for mutable object
	public HashMap<String, String>getTestMap(){
		//return testMap;
		return (HashMap<String,String>)testMap.clone();
	}
	
	//Constructor performing deep copy
	public Emp2(int i, String n,HashMap<String,String>hm) {
		System.out.println("Performing Deep Copy for Object Initialization");
		this.id=i;
		this.name=n;
		HashMap<String,String>tempMap=new HashMap<String,String>();
		String key;
		Iterator<String>it=hm.keySet().iterator();
		while(it.hasNext()) {
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
	}
	
	
}
// To test the consequences of Shallow copy and how to avoid it with 
// deep copy for creating immutable classes
public class Test2 {

	public static void main(String[] args) {
		HashMap<String,String>h1=new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		String s="original";
		int i=10;
		Emp2 e=new Emp2(i,s,h1);
		//Let's see whether its copy by field or reference
		System.out.println(s==e.getName());
		System.out.println(h1==e.getTestMap());
		//print the e values
		System.out.println("e id:"+e.getId());
		System.out.println("e name:"+e.getName());
		System.out.println("e testMap:"+e.getTestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the e values again
		System.out.println("e values after local variable change:");
		System.out.println("e id:"+e.getId());
		System.out.println("e name:"+e.getName());
		System.out.println("e testMap:"+e.getTestMap());
		HashMap<String,String>hmTest=e.getTestMap();
		hmTest.put("4", "Four");
		System.out.println("e testmap after changing variable from accessor methods:"+e.getTestMap());
	}
}
