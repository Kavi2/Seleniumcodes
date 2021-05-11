package corejava;

public class FunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsExample obj=new FunctionsExample();
		int result=obj.pqr();
		System.out.println(result);
		
		int result1=obj.division(100, 10);
		System.out.println(result1);

	}
public void test() {
	System.out.println("Test method");
}

public int pqr() {
	int a=10;
	int b=20;
	int c=a+b;
	return c;
}
public int division(int x,int y) {
	int d=x/y;
	return d;
	
}

}
