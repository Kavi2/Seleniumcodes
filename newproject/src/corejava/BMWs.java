package corejava;

public class BMWs extends Cars {
	
	BMWs(){
		System.out.println("BMWs constructor");
	}
	
	BMWs(int i){
		super(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMWs obj=new BMWs();
		BMWs obj1=new BMWs(10);
		obj.engine();
		obj.wheels();
		obj.topopen();
		obj.twoseat();
		
		
	}
	
	public void topopen() {
		System.out.println("celening open");
	}
    
	public void twoseat() {
		System.out.println("Two seater");
	}

}
