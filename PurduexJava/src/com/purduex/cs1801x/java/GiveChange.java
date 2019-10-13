
package com.purduex.cs1801x.java;

public class GiveChange {

	  /** @param p number of pennies
	  *   @return number of quarters
	  */
	  public static int getQuarters(int p) {
		return p / 25;
		
	  	//TODO: method definition for getQuarters
	  }

	  /** @param p number of pennies
	  *   @param q number of quarters
	  *   @return number of dimes
	  */
	  public static int getDimes(int p, int q) {
		return (p - (q * 25)) / 10;
	  	//TODO: method definition for getDimes
	  }

	  /** @param p number of pennies
	   
	    *   @param q number of quarters
	  *   @param d number of dimes
	  *   @return number of nickels
	  */
	  public static int getNickels(int p, int q, int d) {
		  return (p - (q * 25) - (d * 10)) / 5;
	  	//TODO: method definition for getNickels
	  }

	  /** @param p number of pennies
	  *   @param q number of quarters
	  *   @param d number of dimes
	  *   @param n number of nickels
	  *   @return number of leftover pennies
	  */
	  public static int getPennies(int p, int q, int d, int n) {
		return (p - (q * 25) - (d * 10)) ;
	  	//TODO: method definition for getPennies
	  }

	  public static void main(String[] args) {
	    int pennies = 197;
	    int q = getQuarters(pennies);
	    int d = getDimes(pennies, q);
	    int n = getNickels(pennies, q, d);
	    int p = getPennies(pennies, q, d, n);
	    String str = String.format("The customer should recieve %d " +
	                               "quarters, %d dimes, %d nickels, " +
	                               "and %d pennies.", q, d, n, p);
	  	System.out.println(str);
	  }

	}
