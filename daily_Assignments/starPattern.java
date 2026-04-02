package Coding_Assignments;

public class starPattern {

	public static void main(String[] args) {
		

        for (int i = 5; i >= 1; i--) {   // controls rows
            for (int j = 1; j <= i; j++) { // prints stars
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }

	}

