package Coding_Assignments;

public class typeCasting {

	public static void main(String[] args) {
		// Typecasting
		
		//float value
		float marks=97.8f;
		
		//upcasting: float to double
		double doubleMarks=marks;
		
		//downcasting: float to int
		int intMarks=(int)marks;
		
		//int to char (ASCII Conversion)
		char character=(char)intMarks;
		
		// Printing all values
        System.out.println("Original float value: " + marks);
        System.out.println("After upcasting to double: " + doubleMarks);
        System.out.println("After downcasting to int: " + intMarks);
        System.out.println("Final character (ASCII conversion): " + character);
        
        System.out.println("ASCII " + intMarks + " = '" + character + "'");
		
		

	}

}
