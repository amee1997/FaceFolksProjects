package Perfect;

import java.util.Scanner;

public class MainPer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		int i;
		int sum=0;
		System.out.println("The  divisors are:" );
		for( i=1;i<=n/2;i++)
		{
		 if(n%i==0)	
		 {
			 count++;
			 System.out.print(i+" ");
		 }
		 
		}
		for( i=1;i<=n/2;i++)
		{
		 if(n%i==0)	
		 {
		  sum = sum + i;
	     }
		}
		System.out.println();
		System.out.println("The sum of divisors are:" +sum);
		
		if(sum==n)
		{
			System.out.println("It is a perfect square");
		}
		else
			System.out.println("Not a perfect square");
		 
		
		
		// TODO Auto-generated method stub

	}

}
