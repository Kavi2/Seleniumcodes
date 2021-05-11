package selenium;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\selenium\\Text.txt");
		FileReader fr=new FileReader(file);
		BufferedReader reader=new BufferedReader(fr);
		
		String s;
		while((s=reader.readLine())!=null) {
			System.out.println(s);
		
		}
		
		reader.close();

	}

}
