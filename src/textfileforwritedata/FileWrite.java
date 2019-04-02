package textfileforwritedata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\rameshsoft\\workspace\\1TextFileForData\\src\\textfileforwritedata\\abc123456.txt");

		boolean b = f.createNewFile();
		if (b)
			System.out.println("File is created");
		else
			System.out.println("File is exists!");

		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("hello");
		bw.newLine();
		bw.write("plz practice");
		bw.newLine();
		bw.write("increase ur 1 SIX hrs 2 @ $ to NINE hrs");
		bw.newLine();
		bw.flush();             // move data from Buffer to text file

	}

}


/*
o/p:--
File is created
*/