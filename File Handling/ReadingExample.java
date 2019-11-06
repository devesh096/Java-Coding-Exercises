import java.io.*;
public class ReadingExample //Reading a File using FileInputStream Lec 44 of Saurabh Sir.
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fis=new FileInputStream("F:/java/File Handling/devesh.txt");
		
	
		do{
			i=fis.read();
			if(i!=-1)
				System.out.println((char)i);
		
		}while(i!=-1);
	}
	
}