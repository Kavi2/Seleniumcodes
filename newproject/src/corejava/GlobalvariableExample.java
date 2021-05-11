package corejava;

public class GlobalvariableExample {
	
	String name="Tom";
	int age=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		System.out.println(a);
		//to use global variable you have to create object
		GlobalvariableExample obj=new GlobalvariableExample();
		
		System.out.println(obj.name);
	}

	public void pqr() {
		
		int a=10;
		int b=20;
		System.out.println(a);
         GlobalvariableExample obj=new GlobalvariableExample();
		
		System.out.println(obj.age);
		
	}
}
