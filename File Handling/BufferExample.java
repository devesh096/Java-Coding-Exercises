import java.io.*;
class BufferExample{

public static void main(String [] args) throws IOException 
{
	FileWriter fw=new FileWriter("./bufferexample.txt",true);
	BufferedWriter bf=new BufferedWriter(fw);
	bf.write("Computer");
	bf.close();
}
	
}