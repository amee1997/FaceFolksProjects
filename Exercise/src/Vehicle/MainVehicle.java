package Vehicle;

import java.util.Scanner;

public class MainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vehicle");
		size = sc.nextInt();
		System.out.println("Enter the fare collected for each vehicle");
		int arr[] = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count=0;
		int temp = 0;
		for(int i =0;i<size;i++)
		{
            if(arr[i]>50)
            {
            	count++;
            }
            else if(arr[i]<50)
            {
            	temp++;
            }
         
		}
		System.out.println("The number of heavy vehicle is:" +count);
		System.out.println("The number of light weight vehicle is:" +temp);
	}

}
