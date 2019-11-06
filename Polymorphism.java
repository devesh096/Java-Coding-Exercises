class A
{
	public void f1(int x) // If Two Methods of a class have the same name but the signatures that are not same then the method is called overloaded.
	{
		System.out.println("Class A");
	}
	
}
class B extends A 
{
	public void f1(int x,int y)
	{
		System.out.println("Class B");
	}
	
}
public class Polymorphism // Method overloading is a way to implement Polymorphism.
{
	public static void main(String[]args)
	{
		B obj=new B();
		obj.f1(5);
		obj.f1(3,4);
	
	}
}