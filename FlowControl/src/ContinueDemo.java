
public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("Odd numbers:");
		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}

	}

}
