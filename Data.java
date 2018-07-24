package json_demo;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Data {
	
	public static void main(String[] args) throws Exception {
	
	JSONParser par= new JSONParser();
	
	Reader reader=new FileReader("datahere.json");
	JSONObject jobj=(JSONObject) par.parse(reader);
	
	JSONArray arr=(JSONArray)jobj.get("features");
	//System.out.println(arr.get(1));
	JSONObject j1,j2=null;
	MapData mp=new MapData();
	for(int i=0; i<arr.size(); i++) {
		j1=(JSONObject)arr.get(i);
		j2=(JSONObject)j1.get("properties");
		mp.insert(i,j2);
		
	}
	for(int i=0; i<arr.size(); i++) {
		System.out.println(MapData.map.get(i).toString());
	}
	/*System.out.println(j2.get("mag"));
	String str=(String)jobj.get("type");
	JSONObject metadata=(JSONObject)jobj.get("metadata");
	String str1=(String)metadata.get("api");
	
	System.out.println(str);
	System.out.println(str1);*/
	
	//System.out.println(jarray.);
		
	}

}
