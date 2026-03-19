
public class StringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = " World!";

		int a = 10, b = a++, c = b++;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);

		System.out.println(s1 + s2);

		System.out.println(a + b + c);

		System.out.println(s1 + a + b + c);
		
		System.out.println( a + b + s1 + c);

	}

} 
