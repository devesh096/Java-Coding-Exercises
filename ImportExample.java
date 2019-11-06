package pack1;
import pack2.Student;
public class ImportExample
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.setRollno(1218);
		s1.setName("Devesh Parwani");
		System.out.println("RollNo: "+s1.getRollno());
		System.out.println("Name: "+s1.getName());
		
	}
	
}