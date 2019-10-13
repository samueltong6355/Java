package com.purduex.cs1801x.java;

public class Practice16 {
    public static void main(String[] args) {
         System.out.println("Rhode Island is in the " + getRegion("RI") + " region");
         System.out.println("Winterfell is in the " + getRegion("WF") + " region");
    }
    public static String getRegion(String state) {
         String s = "";
         switch (state) {
         
         /*** TODO: Write a switch statement to serve as the header for the conditional block
                     below. ***/
         case "RI":
              /*** TODO: Write a case statement that includes "RI", and any other code needed
                          to end the case ***/
                   s = "New England";
                   break;
                   default :
              /*** TODO: Write the default case statement, and any other code needed to end
                          the case ***/
                   s = "Unknown";
         }
         return s;
    }
}

