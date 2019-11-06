package mainn;

class Mythread extends Thread
{
	public void run()
	{
		for(int i = 0; i<5;i++)
		{
			System.out.println("Child Thread");
			
		}
	}
	
}

public class thread
{
	public static void main(String args[])
	{
		
		Mythread t = new Mythread();
		t.setPriority(8);
		t.start();
		for(int i =0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
		System.out.println(t.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		
	
	
	}
	
}