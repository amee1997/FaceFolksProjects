package Armstrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainA {

	public static void main(String[] args) throws IOException  {
		int num;
		String j;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number :");
		    num = Integer.parseInt(br.readLine());
		    Anumber obj = new Anumber(num);
		    System.out.println("Do you want to continue:(Y/N)");
		    j = br.readLine();
		}while(j.equalsIgnoreCase("Y"));
		if(j.equalsIgnoreCase("N"))
		{
		System.out.println("Thanks");
		}
		// TODO Auto-generated method stub

	}

}
