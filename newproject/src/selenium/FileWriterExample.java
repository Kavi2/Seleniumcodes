package selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\selenium\\Text.txt");
        FileWriter fw=new FileWriter(file);
		BufferedWriter writer=new  BufferedWriter(fw);
		
		writer.write("This is my first line");
		writer.newLine();
		writer.write("This is my second line");
		writer.newLine();
		writer.write("This is my third line");
		writer.newLine();
		writer.write("This is my fourth line");
		writer.close();
		System.out.println("The file has been written");
	}

}
