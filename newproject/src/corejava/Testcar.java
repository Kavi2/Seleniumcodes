package corejava;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//static polymorphism- compiletime polymorphism 
	// can access all methods in child, parent and garndparent class
     BMW bm=new BMW();
     
     bm.engine();
		
     bm.Infra();
     
     bm.grandparent();
	
	
	//can access all methods in car and parent cannot access methods in child
	
	CarExample ce=new CarExample();
	ce.engine();
	ce.Infra();
	ce.grandparent();
	
	// Dynamic polymorphism -run time polymorpism
	CarExample c1=new BMW();
	c1.wheels();
	c1.engine();
	c1.Infra();
	c1.grandparent();
	
	// will get classcast exception ---we cant do like this
	BMW b1=(BMW) new CarExample();
	b1.topopen();
	b1.wheels();
	b1.Additional();
	b1.engine();
	
	
	
	

}
}