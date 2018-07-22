package com.interview.exception;
//using Exception
class NotValidAge extends Exception{

	public NotValidAge(String s) {
		super(s);
	}
}
public class CustomException {

	public static void main(String[] args) {
		try {
			
			validate(18);
		}catch(NotValidAge e) {
			e.printStackTrace();
		}
	}
	public static void validate(int age) throws NotValidAge {
		if(age==18) {
			System.out.println("You can vote");
		}else {
			throw new NotValidAge("Not elibible to vote");
		}
	}
}
