package corejava;

public class TwoDimentionalarrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s[][]=new String[3][5];
	s[0][0]="A";
	s[0][1]="B";
	s[0][2]="C";
	s[0][3]="B";
	s[0][4]="E";
	
	s[1][0]="A1";
	s[1][1]="B1";
	s[1][2]="C1";
	s[1][3]="B1";
	s[1][4]="E1";
	
	s[2][0]="A2";
	s[2][1]="B2";
	s[2][2]="C2";
	s[2][3]="B2";
	s[2][4]="E2";
	
	System.out.println(s.length);
	System.out.println(s[0].length);
	
	for(int i=0;i<s.length;i++) {
		for(int j=0;j<s[0].length;j++) {
			System.out.println(s[i][j]
					);
		}
	}
	
	
	
	}

}
