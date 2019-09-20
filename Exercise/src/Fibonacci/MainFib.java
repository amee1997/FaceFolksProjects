package Fibonacci;

import java.util.Scanner;

public class MainFib {

	public static void main(String[] args) {
		 int size;
		    int term,t1 = 0,t2 = 1; ;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			size = sc.nextInt();
			for(int i=1;i<=size;i++)
			{
             System.out.print(t1+" ");
             term = t1+t2;
             t1 = t2;
             t2 = term;
			}
			
			//System.out.println("The number of combination  is:" +" " +fact);
			}
}
