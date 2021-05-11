
package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file= new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\sample\\TxtWrite.txt");
		FileWriter fw= new FileWriter(file);
		
		BufferedWriter writer= new BufferedWriter(fw);
		
		writer.write("Hello!!! This is first line");
		writer.newLine();
		writer.write("This is Second Line");
		System.out.println("Data Entered");
		writer.close();
		
	}

}
