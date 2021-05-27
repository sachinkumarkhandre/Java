import java.util.Scanner;

public class PercentagewiseGrade {
	
	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Roll number of the student:");
		
		int rollno = sc.nextInt();
		
		System.out.println("Enter the Name of the student:");
		
		String name = sc.next();
		
		System.out.println("Enter the marks of student in Physics:");
		
		int p = sc.nextInt();
		
		System.out.println("Enter the marks of student in Chemistry:");
		
		int c = sc.nextInt();
		
		System.out.println("Enter the marks of student in Math:");
		
		int m = sc.nextInt();
		
		float t = p+c+m;
		
		System.out.println("The total marks of the student is: "+t);
		
		float pr = (t/300*100);
		
		System.out.println("The the percentage of the student is: "+pr);
		
		if (pr>=75)
			
		{
			System.out.println("The grade of the student is A");
		}	
		
		else if (pr<=74 && pr>=60)
		{
			
			System.out.println("The grade of the student is B");
		}
		
		else 
		{
			System.out.println("The grade of the student is c");
		}
		
	}

}
