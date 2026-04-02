package Coding_Assignments;

public class prime_Num {

	public static void main(String[] args) {
		// write a program to check if a numbe is prime or not

		 
		 int num = 39;        //21=not prime  7= prime  39 =not prime
	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i * i <= num; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " is a Prime number");
	        } else {
	            System.out.println(num + " is NOT a Prime number");
	        }
	    }
	}


