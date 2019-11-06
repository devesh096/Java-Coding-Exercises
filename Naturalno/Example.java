/** Making a Java Program to Print N Natural Numbers in Reverse Order */


import  java.util.Scanner;
class Example
{
	public static void main(String[] args)
	{
		System.out.println(" Enter a Natural Number");
		Scanner kb=new Scanner(System.in);      // Getting Input from the user
		int N=kb.nextInt();                    // Converting a String into a Intiger
		while(N>0)         // while loop 
			
			{
				System.out.println(N);         // printing the value of N uptill N > 0
				N--;
				
			}	
	}
	
}