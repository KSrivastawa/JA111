package com.enums;

import java.util.Arrays;

public enum Enum_Methods_Variables  {

	JAN,FEB,MAR,APR,MAY;
	
	static int i=9;
	
	static void fun1() {
		System.out.println("Hello i: "+i);
	}
	
	public static void main(String[] args) {
		
		fun1();
		
		System.out.println("inside main of enum "+i);
		
		Enum_Methods_Variables[] em = Enum_Methods_Variables.values();
		
		System.out.println(Arrays.toString(em));
		
	}
	
	
}