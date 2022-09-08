import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number to Check -");
		int n =sc.nextInt();//input by user 
		int sof=0;
		int temp=n;
		while(temp!=0)//output formation 
		{
			sof=sof+fact(temp%10);
			temp=temp/10;
		}
		if(sof==n)//condition checking input == output 
		{
			System.out.println(n+" -is peterson number");
		}else
		{
			System.out.println(n+ " -is not peterson number");
		}
	}
	static int fact(int a) //Factorial of each digit in number
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=i*f;
		}
		return f;
	}
	
}