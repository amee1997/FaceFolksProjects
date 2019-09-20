package Height;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MainH {

	public static void main(String[] args) {
		int size;
		double temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		size = sc.nextInt();
		System.out.println("Enter the heights of students");
		double arr[] = new double[size];
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextDouble();
		}
		for(int k =0;k<size-1;k++)
		{
		for(int i =0;i<size-k-1;i++)
		{
			if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
		    }
		}
		}
		System.out.println("The heights in order are:");
		for (int i =0; i<size; i++)
		{
	        System.out.print(arr[i] + " ");
	        System.out.println();

	    }

       }
}
