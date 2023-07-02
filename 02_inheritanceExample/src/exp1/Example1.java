package exp1;

public class Example1 {

	public static void main(String[] args) {
		// A a = new A();
		
	}

}

class A {

	private int a;

	public A(int a) {
		System.out.println("A parameterized constructor");
		this.a = a;
	}

}

class B extends A {

	public B() {
		super(10);
		System.out.println("B default constructor");
	}

}
