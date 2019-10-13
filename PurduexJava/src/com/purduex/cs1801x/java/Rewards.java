package com.purduex.cs1801x.java;


import java.util.Scanner;
/*
A class called Rewards is provided below. The design of this class is to take an order from the user, and then upgrade their rewards opportunities based on how many points that they have accrued.

The basic class structure has been defined for you, with one class variable points that stores the user's current number of rewards points. In addition to a constructor, the class has two methods that you should define, showRewards and getReward.

In the showRewards method, you should write a conditional output that displays all the choices that are available for the current user based on the number of points that they have accrued. A table showing the rewards is given below. The return value of the method should be a String that includes all possible choices given the user's current number of points, with each choice on a new line. An example output is given below the table of possible rewards:

option	points	reward
1	50	free coffee
2	100	free baked good
3	200	free specialty coffee
4	5000	1% store ownership

String s = "1) free coffee - 50 pts\n2) free baked good - 100 pts"

In the getReward method, the user will supply a choice, and the method should complete two tasks. If the user has enough points for their given choice, the method should reduce the user's points by the appropriate amount and then return a String with the user's choice and the number of points remaining; else, the return String should simply state that the user does not have enough points for that item. Some sample output Strings are given below.

choice	user points	output	final value of points
2	120	"You have selected a free baked good!"	20
3	120	"You do not have enough points for that reward."	120
Thinking Through the Problem
 */

public class Rewards {

	int points;

	public Rewards(int points) {
		this.points = points;
	}

	public String showRewards() {
		String s = "";
		
		if (points >= 50) {
			s = "1) free coffee - 50 pts\n";
		} 
		
		if (points >= 100) {
			s += "2) free baked good - 100 pts\n";
		}
		
		if (points >= 200) {
			s += "3) free specialty coffee - 200 pts\n";
		} 
		
		if (points >= 5000) {
			s += "4) 1% store ownership - 5000 pts\n";
			
		}
		
		return s;
	}

	public String getReward(int choice) {
		switch (choice){
		case 1:
			if (points >= 50) {
				System.out.println("You have selected a free coffee");
				points -= 50;
				break;
			} else {
				System.out.println("You do not have enough points for that reward.");
				break;
			}
			
		case 2:
			if (points >= 100) {
				System.out.println("You have selected a free baked good");
				points -= 100;
				break;
			} else {
				System.out.println("You do not have enough points for that reward.");
				break;
			}
			
		case 3:
			if (points >= 200) {
				System.out.println("You have selected a free specialty coffee");
				points -= 200;
				break;
			} else {
				System.out.println("You do not have enough points for that reward.");
				break;
			}
			
		case 4:
			if (points >= 5000) {
				System.out.println("You have 1% ownership of the store");
				points -= 5000;
				break;
			} else {
				System.out.println("You do not have enough points for that reward.");
				break;
			}
		}
		
		return "You have " + points + " left.";
	}
	
	public static void main(String[] args) {
		Rewards r = new Rewards(5000);
		System.out.println(r.showRewards());
		
		System.out.println("Please select you rewoard choice: ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		System.out.println(r.getReward(choice));
	}
}

