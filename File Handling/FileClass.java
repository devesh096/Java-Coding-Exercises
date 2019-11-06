import java.io.*;

public class FileClass{
	public static void main(String[] args) throws IOException
	{
	File f1=new File("F:/java/File Handling/devesh.txt");
	f1.createNewFile(); // Creating a new file
	System.out.println("Is exists:"+f1.exists()); //Wether File exists or not 
	System.out.println("Length of the File is :"+f1.length()); // To find the Size of the File
	f1.delete(); //To Delete a File
	
		
	}
}