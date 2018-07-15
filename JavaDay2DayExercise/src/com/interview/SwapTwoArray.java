package com.interview;

import java.util.Scanner;

public class SwapTwoArray {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first array:");
		for(int i=0;i<10;i++) {
			a[i]=input.nextInt();
		}
		System.out.println("first array:");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("Enter second array:");
		for(int i=0;i<10;i++) {
			b[i]=input.nextInt();
		}
		System.out.println("second array:");
		for(int i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
		
		//swap logic
		for(int j=0;j<10;j++) {
			c[j]=a[j];
			a[j]=b[j];
			b[j]=c[j];
		}
		
		System.out.println("Array after swaping:");
		System.out.println("first array:");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("second array:");
		for(int i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
