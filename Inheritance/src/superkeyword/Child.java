package superkeyword;

public class Child extends Parent{
	void f1() {
		super.f1();
		System.out.println(this);
		System.out.println("Inside child f1");
	}

}
