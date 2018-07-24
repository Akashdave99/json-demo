package json_demo;

import java.util.ArrayList;
import java.util.TreeMap;

import org.json.simple.JSONObject;

public class MapData {
	EarthQuake e1,e2;
	public static TreeMap<Integer,EarthQuake> map=new TreeMap<>();
	//This method is to take "properties" Objects from ArrayOfObjects
	public void insert(int i,JSONObject temp) {
		e1=new EarthQuake();
		e1.setMag((Double)temp.get("mag"));
		e1.setPlace((String)temp.get("place"));
		e1.setUrl((String)temp.get("url"));
		map.put(i, e1);
	}
	public boolean remove(String s) {
		return false;
	}
}
