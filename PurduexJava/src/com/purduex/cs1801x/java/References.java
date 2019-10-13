package com.purduex.cs1801x.java;

public class References {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1 == s2) {
			System.out.println("Equal ==");
		
		}else if(s2.equals(s1)) {
			System.out.println("Address");
	
		}else {
			System.out.println("Neither condition is true");
		}
	}
	
}
