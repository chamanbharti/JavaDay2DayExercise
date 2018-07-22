package com.interview.exception;
//using Exception
class NotValidAgeForVote extends RuntimeException{

	public NotValidAgeForVote(String s) {
		super(s);
	}
}
public class CustomException2 {

	public static void main(String[] args) {
			
			validate(18);
		
	}
	public static void validate(int age) {
		if(age==18) {
			System.out.println("You can vote");
		}else {
			throw new NotValidAgeForVote("Not elibible to vote");
		}
	}
}
