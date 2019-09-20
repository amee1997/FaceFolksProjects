package Retest;

import java.util.Scanner;

public class MainR {

	public static void main(String[] args) {
	int size;
    int count;
    String j;
    do {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students");
	size = sc.nextInt();
	System.out.println("Enter the  of students");
	int arr[] = new int[size];
	for(int i =0;i<size;i++)
	{
		arr[i] = sc.nextInt();
	}
	count=0 ;
	for(int i =0;i<size;i++)
	{
	    if(arr[i]<50)
		{
	     count++;
		}
	}
	System.out.println("The number of students apperaring for retest is :" + count);
	
	System.out.println("Do you want to continue(Y/n)");
	j = sc.next();
    }while(j.equalsIgnoreCase("Y"));
	if(j.equalsIgnoreCase("N"))
	{
	System.out.println("Thanks");
	}
	}	
    
}
