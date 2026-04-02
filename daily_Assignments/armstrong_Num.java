package Coding_Assignments;

public class armstrong_Num {

	public static void main(String[] args) {
		//program to check whether a given number is an Armstrong number or not.
		
	    int num = 153;   
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      // Extract last digit
            sum = sum + (digit * digit * digit); // Cube of digit
            num = num / 10;            // Remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

	}

}
