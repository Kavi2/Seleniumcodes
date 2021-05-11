package corejava;

public class Addition {
	
	int a=10, b=50;
	Integer total;
	
	public Integer sum() {
		
		total=a+b;
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition result=new Addition();
		Integer Mytotal=result.sum();
		
        System.out.println("My total is" +Mytotal);
	}

}
