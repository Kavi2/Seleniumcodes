package corejava;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while
		//Disadvantage of while loop :it will generate infinite loop if you dont give incremental/decremental part
		int i=0;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;
			
		}
		
		//for loop
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	
	
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
		int a=1;
		int b=a++; //post increment
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
