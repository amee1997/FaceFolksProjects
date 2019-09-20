package Fouls;

import java.util.Scanner;

public class MainFauls {
	        public static void main(String[] args) {
			int size;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of players");
			size = sc.nextInt();
			System.out.println("Enter the number of fouls made by each player");
			int arr[] = new int[size];
			for(int i =0;i<size;i++)
			{
				arr[i] = sc.nextInt();
			}
			int min=(arr[0]);
			for(int i =1;i<size;i++)
			{
				if(arr[i]<min)
				min=(arr[i]);
			}
			for(int pos =0;pos<size;pos++)
			{
				if(arr[pos]==min)
				{
					System.out.println("The eligible player is no."+(pos+1)+" "+min+" "+"(fouls)");	
				}
			}
			
			
			
		}

}
