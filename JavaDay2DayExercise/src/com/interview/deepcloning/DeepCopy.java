package com.interview.deepcloning;

public class DeepCopy {

	public static void main(String[] args) {
		try{  
			Customer originalObj = new Customer("Chaman", new Address("Khagaria", "851205")); 		  
			Customer clonedObj=(Customer)originalObj.clone(); 
			System.out.println("Original Object properties: "); 
			System.out.println(originalObj.getName());  
			System.out.println(originalObj.getAddress().getCity());  
			System.out.println(originalObj.getAddress().getPinCode());  
			System.out.println("Cloned Object properties: ");  
			System.out.println(clonedObj.getName());  
			System.out.println(clonedObj.getAddress().getCity());  
			System.out.println(clonedObj.getAddress().getPinCode());
 
			//Change in cloned object
			clonedObj.getAddress().setpinCode("851204");
 
			//Changes will not reflect in original object also
			System.out.println("Original Object pincode after changes in cloned object: "); 
			System.out.println(originalObj.getAddress().getPinCode()); 
 
		}catch(CloneNotSupportedException c){
 
		}
	}
}
