package com.purduex.cs1801x.java;

/*
CS	180	HS	– Topic	3
Project 4: Leap	Years Rubric
I. Completion	Tasks (1	pt	each,	unless	specified)
a. LeapYear.java	exists
b. LeapYear.java	compiles
c. LeapYear Class	header
d. main	method	prototype
e. main	method	body
i. created	Scanner object
ii. prompted	for	user	input
iii. stored	an	integer from	standard	input
iv. used	a	selection	construct	with	the	results	of	the	static	method	call	to	isLeapYear	(2	pts)
v. printed	statement expressing	results	of	program
f. class	method
i. method	prototype
II.Correctness (9 pts)
a. Program	runs	as	expected	(Prompt,	user	input,	outputs:	“The	year	2015 is	not	a	leap	year”	)
III. Style (1	pt	each)
a. Used	camel	casing	for	methods	and	classes
b. One	statement	per	line
c. Blocks	are	clearly	defined
TOTAL:	11	+	9 +	3	=	23 pts
 */

import java.util.*;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputYear = s.nextInt();
		
		System.out.println(isLeapYear(inputYear));
	}

}

