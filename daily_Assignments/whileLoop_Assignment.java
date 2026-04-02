package Coding_Assignments;

public class whileLoop_Assignment {

	public static void main(String[] args) {
		// print numbers from 1 to 50
		
		 int i = 1;

	        while (i <= 50) {

	            if (i % 2 == 0 && i % 5 == 0) {
	                // Multiple of both 2 and 5 → square
	                System.out.println(i * i);
	            } 
	            else if (i % 2 == 0) {
	                // Only multiple of 2 → cube
	                System.out.println(i * i * i);
	            } 
	            else if (i % 5 == 0) {
	                // Only multiple of 5 → number × 5
	                System.out.println(i * 5);
	            } 
	            else {
	                // Otherwise print number
	                System.out.println(i);
	            }

	            i++;
	        }
	    }

	}


