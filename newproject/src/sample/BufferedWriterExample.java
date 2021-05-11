package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="BufferedWriterExample.txt";
		String content="Summer is coming";
		
		FileWriter filewriter= new FileWriter(location);
		
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		
		bufferedwriter.write(content);
		System.out.println("Data Enterted");
		bufferedwriter.close();

	}

}
