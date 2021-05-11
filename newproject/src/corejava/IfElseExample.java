package corejava;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=30;
		int j=50;
		
		if(j>i) {
			System.out.println("J is greater");
		}else {
			System.out.println("i is greater");
		}
			
		int a=10;
		int b=10;
		if(a==b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is not equal to b");
		}
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		if(a1>b1 &a1<c1) {
			System.out.println("a greater");
		}if(b1>c1& b1>a1) {
			System.out.println("b greater");
		}else
		{
			System.out.println("c greater");
		}
	}

}
