package corejava;

public class PolymorphismAddition {
	
	
	int add(int n1, int n2) {
		
		return n1+n2;
		
	}
	
	int add(int r1, int r2, int r3) {
		
		return r1+r2+r3;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismAddition obj= new PolymorphismAddition();
		
		System.out.println("The total is " +obj.add(10, 10));
		System.out.println("The total is " +obj.add(20, 30, 40));
            
		
		
	}

}
