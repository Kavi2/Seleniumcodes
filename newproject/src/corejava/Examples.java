package corejava;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array=new int[2];
		
		array[0]=1;
		array[1]=2;
	
		
		System.out.println(array.length);
		
		
		String[] s1= {"hello","hi","world"};
		System.out.println(s1[0]);
		
		
		String[][] s=new String[3][3];
		
		s[0][0]="A";
		s[0][1]="B";	
		s[0][2]="C";	
		
		s[1][0]="A1";
		s[1][1]="B1";	
		s[1][2]="C1";	
		
		s[2][0]="A2";
		s[2][1]="B2";	
		s[2][2]="C2";
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
			}
				
		}
				
	}

}
