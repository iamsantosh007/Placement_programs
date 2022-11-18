package com.santosh;

import java.util.Scanner;

public class ReverseOfString {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
       System.out.println("enter the string");
       String name=sc.nextLine();
       String newString="";
       char[] arr=name.toCharArray();
       
       for(int i=arr.length-1;i>=0;i--) {
    	   newString+=arr[i];
    	   
       }
       System.out.println("your original string is "+name);
       System.out.println("Reverse of that string is "+newString);
	}

}
