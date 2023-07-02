package exp3;

public class Example3 {
	
	public static void main(String[] args) {
		//super can refer to subclass
		B b1 = new B();
		A b2 = new B();
		//B b3 = new A();
		A a = new A();
		
		System.out.println(b1.a); //1000
		System.out.println(b2.a); //10
		
		System.out.println(b1.getA()); //1000
		System.out.println(b2.getA()); //1000
		
		((B)b2).foo2();
		//((B)a).foo2();
		
		b1.method1();
		b2.method1();
		
		B.method1();
		A.method1();
	}

}

class A{
	int a = 10;
	public void foo1() {
		System.out.println(" foo1 of A class");
	}
	
	public int getA() {
		return a;
	}
	
	public static void method1() {
		System.out.println("A class method1");
	}
}


class B extends A{
	int a = 1000;
	
	@Override
	public void foo1() {
		System.out.println(" foo1 of B class");
	}
	
	public void foo2() {
		System.out.println(" foo2 of B class");
	}
	
	
	public int getA() {
		return a;
	}
	
	public static void method1() {
		System.out.println("B class method1");
	}
	
}
