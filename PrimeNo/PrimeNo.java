
/**import java.util.Scanner;
public class PrimeNo
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");  
		Scanner kb=new Scanner(System.in);   // Taking Input From the user 
		int n=kb.nextInt();                  // Converting String to Intiger
		int i;
		for(i=2;i<n;i++)               // for loop where i=2 , basically i is divisor
			if(n%i==0)                 // checking the reminder of each and every 
				break;                 // if remainder=0 then	 break 
			if(i==n)                   // if remainder not equal to zero and divisor = N (input)
				System.out.println("It is Prime Number");        
			else
				System.out.println("Number is not Prime Number ");
	}
	
}

*/




import java.util.Scanner;


public class PrimeNo{
	
	public static void main(String[] args){

	System.out.println("Enter a Number to check weather a number is prime or not");
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int i;
	for(i=2;i<n;i++)
		if(n%i==0)
			break;
		if(i==n)
			System.out.println("It is Prime Number");
		else
			System.out.println("Number is not a prime number");
		
	}
	}



