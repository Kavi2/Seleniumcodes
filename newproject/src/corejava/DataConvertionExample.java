package corejava;

public class DataConvertionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to convert string to int
		String x="10";
		System.out.println(x+10);
		// to convert it to interger
		
		int i=Integer.parseInt(x);
		System.out.println(i+10);
		
         //int to string convertion
		int j=100;
		System.out.println(j+10);
		String s=String.valueOf(i);
		System.out.println(s+10);
	}

}

