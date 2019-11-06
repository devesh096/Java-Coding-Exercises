import java.util.Scanner;

public class Greater
{
	public static void main(String[] args)
	{
		System.out.println("Enter Two Numbers");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		
		
		int m=kb.nextInt();
		
		if(m>n)
		System.out.println(m+"is greater than"+n);
	
	else if(m==n)
		System.out.println("Both the Numbers are Equal");
	   
		else
			System.out.println(n+"is greater than" +m);
		
	}
	
	
}