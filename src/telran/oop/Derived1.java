package telran.oop;

public class Derived1 extends Base {
	Derived1() {}
	
	Derived1(int ini) {
		super(ini);
	}
	public int multiply(int op1, int op2) {
		System.out.println("Derived1.muliply" );
		plusPlus();
		return op1*op2;
	}

}
