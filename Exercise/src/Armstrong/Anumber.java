package Armstrong;

public class Anumber {
	int num;
	int temp;
	int remainder;
	int result = 0;
	public Anumber(int num) {
		this.num = num;
		temp = num;
		while(temp!=0)
		{
		  remainder = temp%10;
		  result = result+remainder*remainder*remainder;
		  temp = temp/10;
		}
		if(result==(num))
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}
		
	}

}
