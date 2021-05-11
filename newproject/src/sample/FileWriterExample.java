package sample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="FileWriterExample.txt";
		String content="Learning Java is simple";
		
		FileWriter filewriter= new FileWriter(location);
		
		filewriter.write(content);
		
		filewriter.close();
		
		
	}

}
