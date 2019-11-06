import java.io.*;
public class FileExample //Writing to a File using FileOutputStream Lec 44 of Saurabh Sir.
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileOutputStream fout=new FileOutputStream("./devesh.txt",true);
		String s="TATA";
		
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
			fout.write(ch[i]);
		fout.close();
	}
	
}