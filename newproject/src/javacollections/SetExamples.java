package javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		

	hs.notifyAll();	
		
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains("C"));
	System.out.println(hs.size());
	
	
	LinkedHashSet<String> lh=new LinkedHashSet<String>();
	
	lh.add("sami");
	lh.add("kanna");
	lh.add("mani");
	lh.add("rose");
	
     LinkedHashSet<String> lh1=new LinkedHashSet<String>();
	
	lh1.add("popular");
	lh1.add("bindhu");
	lh1.add("mani");
	lh1.add("rose");
	

	
	System.out.println(lh);
	
	lh.addAll(lh1);
	System.out.println(lh.size());
	
	Iterator it=lh.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		
		ts.remove(3);
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.size());
		
		System.out.println(ts);
		
		Iterator it1=ts.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}
	
	

}