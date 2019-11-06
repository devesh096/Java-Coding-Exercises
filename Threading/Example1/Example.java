class A extends Thread // Using Thread Class
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
			System.out.println("i="+i+"Thread A");
	}
}

class B extends Thread  // Using Thread Class
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
			System.out.println("i="+i+"Thread B");
	}
}


public class Example
{
	public static void main(String[] args)
	{
		A o1=new A();
		B o2=new B();
		o1.start();
		o2.start();
	}
}