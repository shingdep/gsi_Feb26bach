package Coding_Assignments;

public class factorial_Num {

	public static void main(String[] args) {
		// Find the factorial of a number using loop.
		

        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }

	}

