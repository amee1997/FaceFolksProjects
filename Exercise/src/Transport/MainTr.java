package Transport;

import java.util.Scanner;

public class MainTr {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of applications");
		size = sc.nextInt();
		System.out.println("Enter the amount(in crores)");
		int arr[] = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int max=(arr[0]);
		for(int i =1;i<size;i++)
		{
			if(arr[i]>max)
			max=(arr[i]);
		}
		System.out.println("The winning bid is:" +max+" "+"Crores");
		
	}
}
