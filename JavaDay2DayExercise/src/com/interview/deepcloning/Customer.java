package com.interview.deepcloning;

public class Customer implements Cloneable{

	private String name;
	private Address address;
	
	public Customer(String name, Address address) {
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public Object clone() throws CloneNotSupportedException{
		//return super.clone();
		
		//deep copy
		Customer customer = (Customer)super.clone();
		customer.address=(Address)this.address.clone();
		return customer;
	}
}
