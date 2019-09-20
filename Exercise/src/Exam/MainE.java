package Exam;

import java.util.Scanner;

public class MainE {

	public static void main(String[] args) {
    int size;
    int temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
size = sc.nextInt();
System.out.println("Enter the  of students");
int arr[] = new int[size];
for(int i =0;i<size;i++)
{
	arr[i] = sc.nextInt();
}
for(int k =0;k<size-1;k++)
{
for(int i =0;i<size-k-1;i++)
{
	if (arr[i] < arr[i+1])
    {
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
}
System.out.println("The prority of marks is:");
for (int i =0; i<size; i++)
{
    System.out.print(arr[i] + " ");
    System.out.println();

}

}
}

