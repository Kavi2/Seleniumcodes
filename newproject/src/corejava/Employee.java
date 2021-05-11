package corejava;

public class Employee {

	String Studentname;
	int rollno;
	
	Employee(){
		rollno=1;
		Studentname="Agni";
		System.out.println("Employee object created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee name=new Employee();
		System.out.println(name.Studentname);
		System.out.println(name.rollno);

	}

}
