package corejava;

public class Animals {

	String Animal_name;
	String Animal_Type;
	
	Animals(String name, String type){
		Animal_name=name;
		Animal_Type=type;
		
	}
		
	public void sayAboutAnimal() {
		
		System.out.println("The answer is:"+Animal_name+ "The answer is:" + Animal_Type );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals animal1=new Animals("Tiger","carnivorus");
	    animal1.sayAboutAnimal();
	    
		Animals anima2=new Animals("Lion","carnivorus");
		anima2.sayAboutAnimal();
		
		

	}

}
