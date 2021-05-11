package corejava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
	
		int b= a.size();
		System.out.println(b);
		for (int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			System.out.println("***********");
		}
			
	ArrayList<Integer> ar=new ArrayList<Integer> ();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.set(1, 100);
	System.out.println(ar.get(1));
	ar.remove(1);
	System.out.println(ar.get(1));
		
	System.out.println("**********************");
			
	Hashtable h=new Hashtable();
	
	h.put(0, "avanthi");
	h.put(1, "kavin");
	h.put(2, "saravanan");
	System.out.println(h.size());
	
	for(int i=0; i<h.size();i++) {
		System.out.println(h.get(i));
	}
	
	
	Hashtable<Integer, String> s=new Hashtable<Integer, String>();
	s.put(0, "avanthi");
	s.put(1, "devi");
	
	
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	
	int result=a1.size();
	System.out.println(result);
	
	EmployeeExample e1=new EmployeeExample("Naveen",26,"QA");
	EmployeeExample e2=new EmployeeExample("Jeeva",29,"QA");
	EmployeeExample e3=new EmployeeExample("Poonam",30,"QA");
	
	ArrayList<EmployeeExample> a2= new ArrayList<EmployeeExample>();
	
	a2.add(e1);
	a2.add(e2);
	a2.add(e3);
	
	Iterator<EmployeeExample> it=a2.iterator();
	while(it.hasNext()) {
		EmployeeExample emp= it.next();
		System.out.println(emp.name);
		
	
	}
	
	
	ArrayList<String> c=new ArrayList<String>();
	c.add("Selenium");
	c.add("Test");
	c.add("Appium");
	c.add("Load Runner");
	
	ArrayList<String> c1=new ArrayList<String>();
	c1.add("Selenium");
	c1.add("Test");
	c1.add("Java");
	c1.add("Sql");
	
	c.addAll(c1);
	
	for(int i=0;i<c.size();i++) {
		System.out.println(c.get(i));
	}
	
	c.retainAll(c1);
	
	ArrayList<String> c2=new ArrayList<String>();
	c2.add("Selenium");
	c2.add("Test");
	c2.add("Appium");
	System.out.println(c2);
	
	ArrayList<String> c3=new ArrayList<String>();
	c3.add("Selenium");
	c3.add("Test");
	c3.add("Java");
	
	c2.retainAll(c3);
	for(int i=0;i<c2.size();i++) {
		System.out.println(c2.get(i));
		
				
		
		ArrayList<String> c4=new ArrayList<String>();
		c4.add("Selenium");
		c4.add("Test");
		c4.add("Appium");
		
		c4.set(1, "KPY");
		System.out.println(c4);
	}
	
		}
	
	}


