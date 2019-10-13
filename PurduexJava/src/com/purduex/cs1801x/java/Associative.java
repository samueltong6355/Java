package com.purduex.cs1801x.java;

import java.util.*;

/*
CS	180	HS	– Topic	2
Project 2: Associative	Property Rubric
I. Completion	Tasks (1	pt	each,	unless	specified)
a. Associative.java	exists
b. Associative.java	compiles
c. Associative Class	header
d. main	method	prototype
e. main	method	body
i. created	Scanner object
ii. prompted	for	user	input
iii. stored	three	integers	from	standard	input
iv. created	Associative	object
v. printed	statement,	using	Associative	method	calls (2	pts)
f. class	variables
i. created	three	integer	variables
g. class	methods
i. method	prototypes
h. class	constructor
i. correct	method	prototype
ii. correctly	assigns	values	to	class	variables
II.Correctness (4	pts)
a. Program	runs	as	expected	(Prompt,	user	input,	outputs:	“Grouping	the	first	two	terms,	(1 + 2)	* 3 =	9”
and	“Grouping	the	last	two	terms,	1 + (2 * 3)	=	7”	)
III. Style (1	pt	each)
a. Used	camel	casing	for	methods	and	classes
b. One	statement	per	line
c. Blocks	are	clearly	defined
TOTAL:	15 +	4	+	3	=	23	pts
 */


public class Associative {
	
	public int x, y, z;
	
	public Associative(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getZ() {
		return this.z;
	}

	public int firstTwo() {
		return (this.x + this.y) * this.z;		
	}
	
	public int lastTwo() {
		return this.x + (this.y * this.z);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input first number: ");
		int input1 = s.nextInt();
		
		System.out.println("Please input second number: ");
		int input2 = s.nextInt();
		
		System.out.println("Please input third number: ");
		int input3 = s.nextInt();
		
		
		Associative a = new Associative(input1, input2, input3);
		int result1 = a.firstTwo();
		int result2 = a.lastTwo();
		
		
		System.out.format("Grouping the first two terms, (%d + %d) * %d = %d", a.getX(), a.getY(), a.getZ(), result1);
		System.out.print("\n");
		System.out.format("Grouping the last two terms, %d + (%d * %d) = %d", a.getX(), a.getY(), a.getZ(), result2);
		
	}
	
}
