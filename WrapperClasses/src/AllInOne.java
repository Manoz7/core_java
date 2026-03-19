public class AllInOne {

	public static void main(String[] args) {

		int x = 199;
		String s = Integer.toString(x);

		Integer b = new Integer(s);

		int z = b.intValue();
		
		Integer c = new Integer(z);
		
		String d = c.toString();
		
		int e = Integer.parseInt(d);
		

	}

}
