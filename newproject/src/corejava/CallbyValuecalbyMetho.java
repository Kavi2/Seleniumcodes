package corejava;

public class CallbyValuecalbyMetho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValuecalbyMetho obj=new CallbyValuecalbyMetho();
		int x=100;
		int y=200;
		int result =obj.testsum(x, y);
		System.out.println(result);

	}

	public int testsum(int a ,int b) {
		a=10;
		b=20;
		int c= a+b;
		return c;
	}
}
