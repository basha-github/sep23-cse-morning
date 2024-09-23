class A{
	int a1=100;
	int a2=200;
	void ma1() {
		System.out.println("From Class A... method..ma1()");
	}
	void ma2() {
		System.out.println("From Class A... method..ma2()");
	}
	
}

class B extends A{
	int b1=100;
	int b2=200;
	void mb1() {
		System.out.println("From Class B... method..mb1()");
	}
	void mb2() {
		System.out.println("From Class B... method..mb2()");
	}	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		A objA = new A();
		B objB = new B();
		
		objB.mb1();
		objB.mb2();
		objB.ma1();
		objB.ma2();
 
	}

}
