package Leap;

import java.util.Scanner;

public class MainLeap {

	public static void main(String[] args) {
		int yr;
		String j;
		do {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		yr = sc.nextInt();
		if((yr%4==0)&&(yr%400==0)&&(yr%100==0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a Leap year");
		}
		System.out.println("Try another year(Y/N)");
		j = sc.next();
		}while(j.equalsIgnoreCase("Y"));
		if(j.equalsIgnoreCase("N"))
		{
		System.out.println("Ok");
		}

	}

}
