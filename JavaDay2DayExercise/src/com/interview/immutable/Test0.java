package com.interview.immutable;

import java.util.Date;

final class Emp3{
	private final Integer id;
	private final String name;
	private final Date date;
	//private constructor will ensure no object creation of class
	private Emp3(Integer id,String name,Date date) {
		this.id=id;
		this.name=name;
		this.date=new Date(date.getTime());
	}
	//factory method to store object creation into single place
	public static Emp3 createObj(Integer id,String name,Date date) {
		return new Emp3(id,name,date);
	}
	//no setter method
	//getter method
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	/**
	    * Date class is mutable so we need a little care here.
	    * We should not return the reference of original instance variable.
	    * Instead a new Date object, with content copied to it, should be returned.
	    * */
	public Date getMutableField() {
        return new Date(date.getTime());
    }
 
    @Override
    public String toString() {
        return id +" - "+ name +" - "+ date;
    }
	
	
}
public class Test0 {

	public static void main(String[] args) {
		Emp3 e=Emp3.createObj(100, "Chaman", new Date());
		System.out.println(e);
		changeObj(e.getId(),e.getName(),e.getMutableField());
		System.out.println(e);
	}
	public static void changeObj(Integer id,String name,Date mutableField) {
		id=101;
		name="Bharti";
		mutableField.setDate(10);
		
	}
}
