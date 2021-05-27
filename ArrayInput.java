
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Enter the number of element you want to store in array:");
		
		n = sc.nextInt();
		
		int [] arr1 = new int [n];
		
		System.out.println("Your array of size "+n+" is allocated:");
		
		System.out.println("Enter the elements in the array");
		
		for (int i=0;i<n;i++)
		{
			
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.print("The given array arr1 is :");
		
		for (int i=0;i<n;i++)
		{
		
		System.out.print(arr1[i]);
		
		}
				
		
	}

}
