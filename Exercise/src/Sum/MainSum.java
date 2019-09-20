package Sum;

import java.util.Scanner;

public class MainSum {

	public static void main(String[] args) {
		int n;
		int sum=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		 n = sc.nextInt();
		}while(n<0);
     
		sum = n*(n+1)/2;

		System.out.println(sum);
		// TODO Auto-generated method stub

	}
	}

