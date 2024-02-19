package InternshipTask;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void generateNumber() {
		int  randomNumber = 0;
		System.out.println("Enter a Number between 1 to 100 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 Random random = new Random();

	        for (int i = 0; i < 100; i++) {
	            randomNumber = random.nextInt(100) + 1; 
	        }
	        System.out.println("=============================================");
	        if(num==randomNumber) {
	        	System.out.println("Congratulations !! ");
	        	System.out.println("Your number is "+num +" and "+"system generate "+randomNumber);
	        	
	        }
	        else {
	        	System.out.println("Oops !!");
	        	System.out.println("Your number is "+num +" and "+"system generate "+randomNumber);
	        	
	        }
	        System.out.println("=============================================");
		
	}
	
	public static void main(String[] args) {
		
		NumberGame.generateNumber();
		
	}
	
}
