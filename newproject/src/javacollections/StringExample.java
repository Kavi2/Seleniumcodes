package javacollections;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello world";
		String s1="Hi all";
		
		System.out.println(s.charAt(2));
		System.out.println(s.chars());
		System.out.println(s.valueOf("w"));
		
		System.out.println(s.contentEquals(s1));
		
		String n=s.concat(s1);
		
		System.out.println(n);
		
		System.out.println(s.isBlank());
		
	
		
	}

}
