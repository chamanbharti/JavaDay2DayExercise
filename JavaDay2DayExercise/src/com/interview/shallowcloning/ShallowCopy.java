package com.interview.shallowcloning;

public class ShallowCopy {

	public static void main(String[] args) {
		try {
			Customer originObj = new Customer("Chaman", new Address("Khagaria","851205"));
			Customer clonedObj=(Customer)originObj.clone();
			
			System.out.println("Original Object properties: ");  
			System.out.println(originObj.getName());
			System.out.println(originObj.getAddress().getCity());
			System.out.println(originObj.getAddress().getPinCode());
			
			System.out.println("Cloned Object properties: ");  
			System.out.println(clonedObj.getName());
			System.out.println(clonedObj.getAddress().getCity());
			System.out.println(clonedObj.getAddress().getPinCode());
			
			//change in clone object
			clonedObj.getAddress().setPinCode("851204");
			
			//changes will reflect in original object also
			System.out.println("Original Object pincode after changes in cloned object: ");  
			System.out.println(originObj.getAddress().getPinCode()); 
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
