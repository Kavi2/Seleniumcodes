package javacollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "anbu");
		hm.put(1, "banu");
		hm.put(2, "chitu");
		hm.put(3, "dangal");
		hm.put(4, "ezhil");
		hm.put(5, "fazil");
		System.out.println(hm);
		 System.out.println(hm.values());
		 
		
		hm.replace(3, "darma");
		System.out.println(hm);
		
		hm.remove(5);
		System.out.println(hm);
		
		
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(6, "gayu");
		hm1.put(7, "hema");
		hm1.put(8, "ishu");
		hm1.put(9, "jANU");
		hm1.put(10, "Kani");
		hm1.put(null, "lali");
		
		hm.putAll(hm1);
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		
		
	   LinkedHashMap<Integer, String> lhm=new  LinkedHashMap<Integer, String>();
	 
	   lhm.put(2, "Arthi");
	   
	   lhm.put(4, "Ajay");
	   lhm.put(5, "Akshay");
	   lhm.put(3, "Akash");
	   lhm.put(1, "Anil");
	   System.out.println(lhm);
	   LinkedHashMap<Integer, String> lhm1=new  LinkedHashMap<Integer, String>();
		 
	   lhm.clone();
	   
	  System.out.println(lhm.containsKey(3)); 
	  
	  
	  TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	  tm.put(0, "kpy");
	  tm.put(1, "kpy1");
	  tm.put(2, "kpy2");
	  tm.put(3, "kpy3");
	  tm.put(4, "kpy4");
	  System.out.println(tm);
	   
	  System.out.println(tm.get(1));
	  
	  System.out.println(tm.firstKey());
		
	  System.out.println(tm.keySet());
	  
	  System.out.println(tm.values());
	}

}
