
public class NonStaticMembersDemo {

	int num;

//	NonStaticMembersDemo() {
//		System.out.println("Inside a constructor!!");
//	}

//	Non static block
	{
		System.out.println("Inside non static block!!");
	}

//	Main block
	public static void main(String[] args) {
		System.out.println("Inside main method!");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		obj.doSomething();
	}

//	Static block
	static {
		System.out.println("Inside static block!!");
	}

	void doSomething() {
		System.out.println("Inside DoSomething!!");
	}
}
