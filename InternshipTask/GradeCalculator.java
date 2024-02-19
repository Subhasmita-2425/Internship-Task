package InternshipTask;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void gradeCalculator() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subject to enter marks ");
		int noOfSub=sc.nextInt();
		for(int i=1;i<=noOfSub;i++) {
			System.out.println("Enter Subject No "+i);
			int marks = sc.nextInt();
			sum+=marks;
		}
		int average = sum/noOfSub;
		System.out.println("Your percentage is "+average+"% ");
		if(average<30) {
			System.out.println("Your grade is F (Fail)");
		}
		else if(average>=30 && average<=50) {
			System.out.println("Your grade is B (Good)");
		}
		else if(average>50 && average<=70) {
			System.out.println("Your grade is A (Very Good)");
		}
		else if(average>70 && average<=100) {
			System.out.println("Your grade is O (Excellent)");
		}
		
	}
	
   public static void main(String[] args) {
	
	   gradeCalculator();
	   
   }
}
