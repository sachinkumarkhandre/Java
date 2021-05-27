
import java.util.Scanner;


public class AdditionOfDifferentTypesFunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		Scanner sc = new Scanner(System.in)	;
		
		System.out.println("Enter the three numbers:");
		a=sc.nextInt();
		b =sc.nextInt();
		c= sc.nextInt();
		
		int z =add(a,b,c);
		System.out.println("value of sum of three variable is "+z);
		z =add(a,b);
		System.out.println("value of sum of two variable is "+z);
	}
	
	
	public static int add(int x ,int y) 
	{
		int c = x+y;
		return c;
	}
	
	
	public static int add(int x, int y, int z)
	{
		int c = x+y+z;
		return c;
		
	}
	
	
	

}
