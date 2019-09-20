package Resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainR {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		String degree;
		String branch;
		String contactNumber;
		String j;
		do {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name :");
		   name = br.readLine();
		System.out.println("Enter your age :");
		   age = Integer.parseInt(br.readLine());
		System.out.println("Enter your Degree : ");  
		   degree = br.readLine();
		System.out.println("Enter your Branch : ");
		   branch = br.readLine();
	    System.out.println("Enter your Contact Number : ");
		   contactNumber = br.readLine(); 
	Trainer tr = new Trainer(name,age,degree,branch,contactNumber);
	    System.out.println("Do you want to Edit:(Y/N)");
	    j = br.readLine();
		}while(j.equalsIgnoreCase("Y"));
		if(j.equalsIgnoreCase("N"))
		{
		System.out.println("Thanks");
		}
	       
		
		// TODO Auto-generated method stub

	}

}
