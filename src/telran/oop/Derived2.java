package telran.oop;

public class Derived2 extends Derived1 {
	Derived2() {}

	Derived2(int ini) {
		super(ini);
	}
	public int divide(int op1, int op2) {
		System.out.println("Derived2.divide" );
		plusPlus();
		return op1/op2;
	}	
	public int remainder(int op1, int op2) {
		return op1%op2;
	}
}
