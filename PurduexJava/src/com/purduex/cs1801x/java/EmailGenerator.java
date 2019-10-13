package com.purduex.cs1801x.java;

/*
Project 3: Email Generator Rubric
I. Completion Tasks (1 pt each, unless specified)
a. EmailGenerator.java exists

b. EmailGenerator.java compiles

c. EmailGenerator Class header

d. main method prototype

e. main method body

i. created Scanner object

ii. prompted for user input

iii. stored two Strings from standard input (2pts)

iv. printed statement, using EmailGenerator method calls (2 pts)

f. class methods

i. method prototypes

ii. method return values match prototype

II.Correctness (4 pts)
a. Program runs as expected (Prompt, user input, outputs: “This user’s e-mail is: ghopper@purdue.edu” )

III. Style (1 pt each)
a. Used camel casing for methods and classes

b. One statement per line

c. Blocks are clearly defined

 TOTAL: 12 + 4 + 3 = 19 pts
 */

import java.util.Scanner;

public class EmailGenerator {

	public static String makeUserName(String firstName, String lastName) {
		
		String firstLetter = String.valueOf(firstName.charAt(0));
		return (firstLetter + lastName).toLowerCase();
	} 

	public static String makeEmail(String userName, String domain) {
		String email = (userName + "@" + domain).toLowerCase();
		return email;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your first name");
		
		String firstName = s.nextLine();

		System.out.println("What is your last name");
		String lastName = s.nextLine();
		
		String user = EmailGenerator.makeUserName(firstName, lastName);
		String makeE = EmailGenerator.makeEmail(user, "purdue.edu");

		System.out.println("This user’s e-mail is: " + makeE);

	}

}

