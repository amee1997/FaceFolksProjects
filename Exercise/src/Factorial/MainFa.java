package Factorial;

import java.util.Scanner;

public class MainFa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int size;
    int fact = 1 ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of alphabets in your name");
	size = sc.nextInt();
	for(int i=1;i<=size;i++)
	{
		fact = fact * i;
	}
	
	System.out.println("The number of combination  is:" +" " +fact);
	}
}