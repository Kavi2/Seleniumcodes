package corejava;

public class Animal {
	
	String animal_name;
	String animal_type;
	
	Animal(String name,String type){
		animal_name=name;
		animal_type=type;
		
		
	}
	
	public void sayAboutAnimal() {
		System.out.println("Animal name is" +animal_name+ " Animal type is " +animal_type);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1=new Animal("Duck"  ,"Omnivores");
		animal1.sayAboutAnimal();
		

		Animal animal2=new Animal("Lion"  ,"carnivorus");
		animal2.sayAboutAnimal();
		

	}

}
