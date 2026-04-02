package Coding_Assignments;

public class studentResultSystem {

	public static void main(String[] args) {
		 
		
		 // Input: Marks of 5 subjects(out of 100)
        int math = 85;
        int sci = 78;
        int ss = 92;
        int eng = 67;
        int hin = 74;
        
     // Check fail condition
        if (math < 33 || sci < 33 || ss < 33 || eng < 33 || hin < 33) {
            System.out.println("Result: Fail");
            System.out.println("Grade: F");
        } 
        else {
            // Calculate total and percentage
            int total = math + sci + ss + eng + hin;
            int percentage = total / 5;

            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Result: Pass");

            // Grade calculation
            if (percentage >= 90) {
                System.out.println("Grade: A+");
            } else if (percentage >= 75) {
                System.out.println("Grade: A");
            } else if (percentage >= 60) {
                System.out.println("Grade: B");
            } else if (percentage >= 50) {
                System.out.println("Grade: C");
            }else if(percentage >=33) {
            	System.out.println("Grade:D");
            }
            else {
                System.out.println("Fail");
            }
        }
    }


	}


