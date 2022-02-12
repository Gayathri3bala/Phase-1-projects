package StringArrayMapRegex;

public class Stringdemo {
	
	public static void main(String[] args) {
		
		String str=new String("Hello World");
		System.out.println(str);
		System.out.println(str.substring(5));
		
		String s1="Happy Day";
		System.out.println(str.compareTo(s1));
		
		System.out.println(str.isEmpty());
		System.out.println(str.concat("Welcome"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.trim());
		
		//StringBuffer
		System.out.println("\n");
		System.out.println("string buffer");
		StringBuffer B=new StringBuffer("Hope all are doing ");
		B.append("good");
		System.out.println(B);
		B.delete(1, 7);
		System.out.println(B);
		B.replace(5, 7, "you ");
		System.out.println(B);
		B.reverse();
		System.out.println(B);
		System.out.println("\n");
		
		//StringBuilder
		System.out.println("string builder");
		StringBuilder b=new StringBuilder("Happy weekend");
		System.out.println(b);
		StringBuilder b1 =new StringBuilder("HaPpY WeEkEnD");
		System.out.println(b.compareTo(b1));
		System.out.println("Capacity of b:"+b.capacity());
		System.out.println("Length of b:"+b.length());
	
		
		
		
		
		
	}

}
