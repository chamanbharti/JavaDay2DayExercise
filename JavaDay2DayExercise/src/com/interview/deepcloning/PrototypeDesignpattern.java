package com.interview.deepcloning;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable{
	
	private List<String>empList;
	
	public Employee() {
		empList = new ArrayList<>();
	}
	
	public Employee(List<String> list) {
		this.empList=list;
	}
	
	public void loadData() {
		empList.add("Rahi");
		empList.add("Chaman");
		empList.add("Sahil");
		empList.add("Aman");
		empList.add("Naman");
		
	}
	
	public List<String>getList(){
		return empList;
	}
	
	public Object clone()throws CloneNotSupportedException{
		List<String>temp=new ArrayList<>();
		for(String s:this.getList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}
}
public class PrototypeDesignpattern {

	public static void main(String[] args) {
		
		try {
			Employee e=new Employee();
			e.loadData();
			
			//use the clone method to get the Employee object
			Employee ee=(Employee)e.clone();
			Employee eee=(Employee)e.clone();
			List<String>list = e.getList();
			list.add("Bharti");
			List<String>list1 = eee.getList();
			list1.remove("Chaman");
			System.out.println("e List: "+e.getList());
			System.out.println("ee List: "+list);
			System.out.println("eee List: "+list1);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
