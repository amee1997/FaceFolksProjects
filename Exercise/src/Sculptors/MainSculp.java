package Sculptors;

import java.util.Scanner;

public class MainSculp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		k = sc.nextInt();
		int s = k+(k/5);
		System.out.println("Number of Sculptors can be made is" +" "+s);

	}

}
