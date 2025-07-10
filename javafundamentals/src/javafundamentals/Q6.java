package javafundamentals;

import java.util.Scanner;

public class Q6
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		 if(n==0)
		{
			System.out.println("No values");
		}
		else
		{
			String arr[]=new String[n];
			for(int i=0;i<n;i++)
			{ 
				arr[i]=sc.nextLine();
			}
			for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) {
                    System.out.print(",");
		       }
	        }

	     }
	}

}