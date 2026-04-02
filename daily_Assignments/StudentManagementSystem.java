package Coding_Assignments;

public class StudentManagementSystem {

	public static void main(String[] args) {

	     // Student details with appropriate data types

        int age = 21;                       // Student age
        int marks = 450;                    // Marks out of 500
        byte batteryPercentage = 85;        // 0–100 fits in byte
        int cityPopulation = 2500000;       // Population (25,00,000)
        char grade = 'A';                   // Single character grade
        long bankBalance = 50000;          // No decimals, large value
        boolean isLoggedIn = true;          // Login status
        int distanceToCollege = 1500;       // Distance in meters
        long largeNumber = 9000000000L;     // Very large number (note 'L')

        // Printing details in proper format

        System.out.println("****** Student Management System ******");
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks + " / 500");
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Population: " + cityPopulation);
        System.out.println("Grade: " + grade);
        System.out.println("Bank Balance: ₹" + bankBalance);
        System.out.println("Login Status: " + isLoggedIn);
        System.out.println("Distance: " + distanceToCollege + " meters");
        System.out.println("Large Number: " + largeNumber);
    }
}
	
