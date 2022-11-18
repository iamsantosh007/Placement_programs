package com.santosh;

import java.util.Scanner;

public class evenOdd {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the number you want to check:-");
		int a=sc.nextInt();
		if((a%2)==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is odd");
		}

	}

}
