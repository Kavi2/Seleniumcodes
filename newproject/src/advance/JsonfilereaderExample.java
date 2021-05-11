package advance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonfilereaderExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
     JSONParser jsonparser=new JSONParser();
     File file=new File("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\advance\\avanthi.txt");
     FileReader fr=new FileReader(file);
   Object parsedobject= jsonparser.parse(fr);
  JSONObject jsonobject= (JSONObject) parsedobject;

 
 JSONArray array=(JSONArray) jsonobject.get("Special Qualifications");
 Iterator iterator=array.iterator();
 while(iterator.hasNext()) {
	 System.out.println(iterator.next());
 }
 
 Long age=(Long) jsonobject.get("Age");
 String name= (String) jsonobject.get("Name");
  
	}

}
