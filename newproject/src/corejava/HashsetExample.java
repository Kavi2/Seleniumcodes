package corejava;

import java.util.HashSet;
import java.util.TreeSet;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> ar=new HashSet<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("G");
		ar.add("D");
		ar.add("E");
		ar.add("F");
		
		
		System.out.println(ar);
		
		boolean s=ar.isEmpty();
		System.out.println(s);
		
		boolean s1=ar.contains("D");
		System.out.println(s1);

		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(4);
	    ts.add(2);
		ts.add(3);
		ts.add(5);
		ts.add(6);
		ts.add(1);
	
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts.headSet(5));
		
		System.out.println(ts.tailSet(3));
		System.out.println(ts.subSet(2, 5));
		
		System.out.println(ts.comparator());
		
		System.out.println(ts.lower(5));
		
	}

}
