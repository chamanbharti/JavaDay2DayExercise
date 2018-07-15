package com.interview.swap;

public class SwapNumerWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before swaping number: "+a+" "+b);
		//1 logic
		/*
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		*/		
		
		//2 logic
		//a=a+b-(b=a);//10+20-(10)=30-10=20 e.g. a=20 b=10
		
		//3 logic >>this logic is not working
		/*
		a=a^b;
		a=a^b;
		a=b^a;*/
		
		//4 logic >>this logic is not working
		/*
		a=b-~a-1;
		a=a+~b+1;
		a=a+~b+1;*/
		System.out.println("After swaping number: "+a+" "+b);
	}
}
