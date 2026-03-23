package superkeyword;

public class SuperClass {
	int x;

	public SuperClass() {
		System.out.println("No Arg SuperClass COnstructor!!");
	}

	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One Arg SuperClass Constructor!!");

	}

}
