package com.purduex.cs1801x.java;

public class Practice08 {
    public static void main(String[] args) {
         Thingy t1, t2;

         /*** TODO: Declare two new objects of type Thingy using the variables t1 and t2.
                    For t1, pass the value 3 to the constructor.
                    For t2, pass the value -4 to the constructor. ***/

		t1 = new Thingy(3);
		t2 = new Thingy(-4);


         /*** DO NOT edit print statements below ***/
         System.out.println("Doing the crazy calculation for t1 with input 4 gives " + t1.crazyCalc(4));
         System.out.println("Doing the crazy calculation for t2 with input 3 gives " + t2.crazyCalc(3));
    }
}

