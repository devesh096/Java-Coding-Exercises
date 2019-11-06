import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=kb.nextInt();
		if(n>=0)
		{
		int f=1;
		while(n!=0)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial is "+f );
		}
		else
			System.out.println("Invalid Entry");
	}
}




/**import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{	
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = kb.nextInt();
		if(n>0)
		{
			int f=1;
			while(n!=0)
			{
				f = f*n;
				n--;
				
				
			}
			
			System.out.println("Factorial is "+f);
		}
		
		else
		
			System.out.println("Invalid Entry");
		
		
		
	}
	
}

*/