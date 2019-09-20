package NCR;

import java.util.Scanner;

public class MainNcr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of n");
		long n = sc.nextInt();
		System.out.println("Enter the number of r");
		long r = sc.nextInt();
		long n1 = 1;
		long r1 = 1;
		long s1=1;
		for(int i=1;i<=n;i++)
		{
			n1 = n1 * i;
		}
		for(int i=1;i<=r;i++)
		{
			r1 = r1 * i;
		}
		
		long s = n-r;
		for(int i=1;i<=s;i++)
		{
			s1 = s1 * i;
		}
		
		long ncr = n1/(r1*s1);
		System.out.println("The NCR factor for given values is:"+ncr);
		
		// TODO Auto-generated method stub

	}

}
