package corejava;

public class Cars extends Vehicles {
	
	Cars(){
		System.out.println("Cars constructor");
	}
	Cars(int i){
		System.out.println("Cars constructor:"+i);
	}
	Cars(int i,int j){
		System.out.println("Cars constructori"+i+"Cars constructor j"+j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars c=new Cars();
		

	}

	public void engine() {
		System.out.println("Car engine");
	}
    
	public void Infra() {
		System.out.println("car Infra");
	}
	
	
	public void secret() {
		System.out.println("car secret");
	}
    
	public void space() {
		System.out.println("car sace");
	}
	
	
}
