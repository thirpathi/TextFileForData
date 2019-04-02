package textfilereusablefunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ReusableFrameWorkClass
{
	
	static String filepath;
	static File f;
	static FileWriter fw;
	static BufferedWriter bw;
	static FileReader fr;
	static BufferedReader br;
	
	
	public ReusableFrameWorkClass(String filepath) 
	{
		this.filepath = filepath;
	}
	
	public static void fileWriting() throws IOException
	{
		f = new File(filepath);
		f.createNewFile();
		fw = new FileWriter(f);
		bw = new BufferedWriter(fw);
	}	
	
	public static void fileReading() throws IOException
	{
		f = new File(filepath);
		fr = new FileReader(f);
		br = new BufferedReader(fr);
	}	
	
	public static void writeDataString(String data) throws IOException 
	{
		bw.write(data);
		bw.flush();
	}
	
	public static void writeDataInt(int data) throws IOException 
	{
		bw.write(data);
		bw.flush();
	}
	
	public static String ReadData() throws IOException 
	{
		String data = br.readLine();
		return data;
		

	}
	
}
