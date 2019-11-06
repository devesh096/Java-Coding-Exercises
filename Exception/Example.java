import java.io.*;
public class Example
{
	
public static void main (String[] args) 
{
	try
	{
throw new IOException();
//System.out.println("After Exception");	
	}
	catch(IOException e)
	{System.out.println("Exception:"+e.getMessage());}
	
	
}
}