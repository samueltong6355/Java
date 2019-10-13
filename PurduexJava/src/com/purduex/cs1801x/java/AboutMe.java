package com.purduex.cs1801x.java;

public class AboutMe{
	  private String name;
	  private String school;
	  private int age;
	  
	  public AboutMe(String name, String school, int age){
	    this.name = name;
	    this.school = school;
	    this.age = age;
	  }
	  
	  public String myName() {
	    return this.name;
	  }
	  
	  public String mySchool() {
	    return this.school;
	  }
	  
	  public int myAge() {
	    return this.age;
	  }
	  
	  public static void main(String[] args){
	    System.out.println("Hello, how are you?");
	    AboutMe aboutMe = new AboutMe("Phil", "Purdue University", 36);
	    System.out.println("My name is " + aboutMe.myName() + ", and I attend " + aboutMe.mySchool() + ". I am " + aboutMe.myAge() + " years old.");
	  }
	}

