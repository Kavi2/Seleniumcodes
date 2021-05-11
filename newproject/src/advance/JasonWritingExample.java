package advance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonWritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("Name", "Kavin");
        jsonObject.put("Age", "10");
        
        JSONArray array= new JSONArray();
        array.add("magical smile");
        array.add("magnatic eyes");
        
        jsonObject.put("Special Qualities", array);
        
        File file=new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\advance\\avanthi.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();
        
	}

}
