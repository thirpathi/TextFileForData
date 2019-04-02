package textfilereaddata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RealTimeFileReadDemo {
	
	public static void main(String[] args) throws IOException {
		

		File f = new File("D:\\rameshsoft\\workspace\\1TextFileForData\\src\\textfileforwritedata\\abc123.txt");

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready())
		{
			System.out.println(br.readLine());
		}
		
	}
}


/*
o/p:-
ok
Electronics
*/