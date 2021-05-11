package corejava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("TestNG");
		ll.add("Java");
		ll.add("Maven");
		
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("GIT");
		ll1.add("API");
		ll1.add("TestNG");
		ll1.add("Maven");
		ll1.add("Cucumber");
		
		
		ll.addFirst("Testing courses");
		ll.addLast("Reports");
		System.out.println(ll);
		
		ll.set(2, "Extended Report");
		System.out.println(ll);
		
		
		EmployeeExample emp1=new EmployeeExample("Naveen",20,"QA");
		EmployeeExample emp2=new EmployeeExample("Kavin",10,"QA");
		
		LinkedList<EmployeeExample> ar= new LinkedList<EmployeeExample>();
		ar.add(emp1);
		ar.add(emp2);
		
		
		Iterator<EmployeeExample> it=ar.iterator();
		while(it.hasNext()) {
			EmployeeExample emp=it.next();
			System.out.println(emp.name);
		}
		
	}

	
}
