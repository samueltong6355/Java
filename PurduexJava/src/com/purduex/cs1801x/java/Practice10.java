package com.purduex.cs1801x.java;

public class Practice10 {
    public static void main(String[] args) {
         String s1 = "I am the very model of a modern major general";
         String s2, s3;

         /*** TODO: Use the substring method to store "model" from s1 in s2, and "major general" from s1 in s3. ***/
		  
     
     	s2 = s1.substring(14, 19);
     	s3 = s1.substring(32, 45);
     
     
		  // DO NOT edit print statement below
         System.out.println("s2: " + s2 + "\ns3: " + s3);
    }
}

