package com.interview.shallowcloning;

public class Address implements Cloneable{

	private String city;
	private String pinCode;
	public Address(String city, String pinCode) {
		this.city=city;
		this.pinCode=pinCode;
	}
	
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getPinCode() {
		return this.pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode=pinCode;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
