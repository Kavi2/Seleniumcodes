package corejava;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
	    System.out.println(i[2]);
	    System.out.println(i.length);//print the size
	    //to see all the values of array use for loop
	    
	    for(int j=0;j<4;j++) {
	    	System.out.println(i[j]);
	    	
	    	String s[]=new String[2];
	    	s[0]="hello";
	    	s[1]="world";
	    	System.out.println(s[1]);
	    }

	    
	    Object ob[]=new Object[6];
	    ob[0]="Tom";
	    ob[1]=25;
	    ob[2]=12.33;
	    ob[3]='$';
	    ob[4]="1/1/1990";
	    ob[5]='$';
	    
	    for(int k=0;k<6;k++) {
	    	System.out.println(ob[k]);
	    }
	}

}
