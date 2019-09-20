package Average;

import java.util.Scanner;

public class Mainavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int size;
    int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students");
	size = sc.nextInt();
	System.out.println("Enter the marks of students");
	int arr[] = new int[size];
	for(int i =0;i<size;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i =0;i<size;i++)
	{
		sum = sum + arr[i];
	}
	int avg = sum/size;
	System.out.println("The average is:" +" " +avg);
	}
}
