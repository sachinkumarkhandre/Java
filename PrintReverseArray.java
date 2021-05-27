
import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		
		int n;
		
		System.out.println("Enter the number of element in array:");
		
		n = sc.nextInt();
		
		System.out.println("The array size is "+n);
		
		int[] arr1 = new int[n];
				
		System.out.println("Enter the array elements ");
		
		for (int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.println("The given array is as follows:");
		
		for (int i=0;i<n;i++)
			
		{
			System.out.print(arr1[i]);
		}
			
		System.out.println("\nThe revese of the array is as follows");
		
		for (int i=n-1;i>=0;i--)
			
		{
			
			System.out.print(arr1[i]);
		}
	}

}
