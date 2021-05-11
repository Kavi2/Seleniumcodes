package advance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonfilewriterexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Avanthi");
		jsonObject.put("Age", 5);
		
		JSONArray array=new JSONArray();
		array.add("Magnetic eyes");
		array.add("Power");
		
		jsonObject.put("Special Qualifications", array);
		
		File file=new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\advance\\avanthi.txt");
		FileWriter fw=new FileWriter(file);
		fw.write(jsonObject.toJSONString());
		fw.close();

	}

}
