
import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers a & b:");
		
		int a = sc.nextInt();
		
		System.out.println("Number a="+a);
		
		int b = sc.nextInt();
		
		System.out.println("Number b="+b);
		
		int temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("The swaped values are as follows:");
		
		System.out.println(" a = " +a+" and b = " +b);
		
		
	}
	

}
