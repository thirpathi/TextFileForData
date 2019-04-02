package textfilereaddata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\rameshsoft\\workspace\\1TextFileForData\\src\\textfileforwritedata\\abc123456.txt");

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		/*
		String line1 = br.readLine();
		System.out.println(line1);

		String line2 = br.readLine();
		System.out.println(line2);

		String line3 = br.readLine();
		System.out.println(line3);
		*/
		
		// dinamic way
		  while(br.ready()) 
		  {
			String text = br.readLine();
		    System.out.println(text); 
		  }
		 
	}
}


/*o/p:--ok
hello
plz practice
increase ur 1 SIX hrs 2 @ $ to NINE hrs
*/