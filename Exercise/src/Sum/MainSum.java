package Sum;

import java.util.Scanner;

public class MainSum {

	public static void main(String[] args) {
		int size;
		int sum=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		size = sc.nextInt();
		}while(size<0);
		int arr[] = new int[size];
		if(size<0)
		{
			System.out.println("Invalid input");
		}
		else
		{
		for(int i =0;i<=size;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}
	}
}
