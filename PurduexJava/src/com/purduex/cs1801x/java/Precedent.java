package com.purduex.cs1801x.java;

public class Precedent {

	public static String whatsBefore(String findedWord, String mainWord) {
		int x = mainWord.indexOf(findedWord);
		String before = mainWord.substring(0, x);
		return before;
	}
	
	public static void main(String[] args) {
		String str = Precedent.whatsBefore("cat", "A kittycat is at the door");
		System.out.println(str);

	}

}
