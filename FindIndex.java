

import java.util.Scanner;


public class FindIndex {
	
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number of elements in the array:");
		
		n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int i;
		
		System.out.println("Enter the array elements:");
		
		for (i=0;i<n;i++)
			
		{
			
			arr1[i]= sc.nextInt();
			
		}
				
		System.out.println("The entered array is as follows");
		
		for ( i=0; i<n; i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("Enter the number in array of which index is to be find out ");
	
		int N = sc.nextInt();
		
		System.out.println("The entered number is "+N+" and we are checking the index of the number if the number is present in array");
		
		int count=0;
		
		for( i=0; i<arr1.length; i++)
		{
			if (N== arr1[i]) 
		
				{
					count++;
					break;
				}
		}
		if(count==1)
			System.out.println("the index number is "+i);
			else
				System.out.println("Entered number is invalid");
			
		}
	
			
	    

		
		}
	
	
	
	


