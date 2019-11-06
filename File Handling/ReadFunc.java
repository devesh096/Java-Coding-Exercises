import java.io.*;
public class ReadFunc
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new FileReader("bufferexample.txt"));
		char []s=new char[20];
		bf.read(s,0,4);
		System.out.println(s);
		bf.close();
		


		
		
	}

}