package com.lti;

public class Calc {
	
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	
	public static int subs(int num1,int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum "+add(10,20));
		System.out.println("subtraction is "+subs(10,20));

	}

}
