package exp6;

public class Example6 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		s1 = s1.concat("def");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //false
		
		/*
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		*/
		
		
		System.out.println(s1); //abcdef
		System.out.println(s2); //abc
	}
}
