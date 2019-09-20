package Cricket;

import java.util.Scanner;

public class MainC {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		size = sc.nextInt();
		System.out.println("Enter the runs conceded by the bowlers");
		double arr1[] = new double[size];
		for(int i =0;i<size;i++)
		{
		
		arr1[i] = sc.nextInt();
		}
        System.out.println("Enter the number of balls for each bowlers");
		double arr2[] = new double[size];
		for(int i =0;i<size;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Economy of bowlers is");
		double arr[] = new double[size];
		for(int i =0;i<size;i++)
		{
			arr[i] = arr2[i]/6;
		}	
		double result[] = new double[size];
		for(int i =0;i<size;i++)
		{
			result[i] = arr1[i]/arr[i];
		}
		for(int i =0;i<size;i++)
		{
			System.out.printf("%.1f \n",result[i]);
		}
		double arr3[] = new double[size];
		double sum = 0;
		for(int i =0;i<size;i++)
		{
			sum = sum + result[i];
		}
		double avg  = sum/size;
		
		System.out.println("The overall economy of the team is:" );
		System.out.printf("%.1f \n",avg);
		int count=0;
		for(int i =0;i<size;i++)
		{
			if(result[i]>=avg)
			{
				count++;
			}
		}
		System.out.println("The number of bowlers eligle are:" +count);
		
}
}
