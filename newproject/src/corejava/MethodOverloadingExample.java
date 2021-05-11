package corejava;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample obj=new MethodOverloadingExample();
		obj.sum();
		obj.sum(2);
		obj.sum(3,4);
	}
    public void sum() {
    	System.out.println("im ok");
    }
    public void sum(int i) {
    	System.out.println(i);
    }
    public void sum(int i,int j) {
    	System.out.println("i value is"+i +"j value is:"+j);
    }
    
}
