public class PrimitiveAndString {
	public static void main(String[] args) {
		byte x = 100;

//		Convert into string
		String s = Byte.toString(x);
		
//		Convert into Byte
		byte y = Byte.parseByte(s);
	}
}
