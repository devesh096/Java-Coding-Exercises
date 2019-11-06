import java.util.Scanner;
public class RectangleArea
{
	public static void main(String []args )
	{		
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Length and Breath of a Rectangle to Calculate Its Area");
    int l=kb.nextInt();
    int b=kb.nextInt();
    int area=l*b;
    System.out.println("Area of Rectangle is "+area);
	}	
	
	
	
}