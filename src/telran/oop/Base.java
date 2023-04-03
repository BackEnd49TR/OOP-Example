package telran.oop;

public class Base implements Operations {
	
	private int amountOfCalls;
	
	Base() {		
	}
	
	Base(int ini) {
		amountOfCalls = ini;
	}
	
	public int sum(int op1, int op2) {
		plusPlus();
		return op1 + op2;
	}
	public int substruct(int op1, int op2) {
		plusPlus();
		return op1 - op2;
	}
	public int multiply(int op1, int op2) {
		System.out.println("Base.muliply" );
		int sum = 0;
		for(int i=0; i<op1; i++) {
			sum += op2;
		}
		plusPlus();
		return sum;
	}
	public int divide(int op1, int op2) {
		System.out.println("Base.divide" );
		int o1 = Math.abs(op1);
		int o2 = Math.abs(op2);
		int result = 0;
		while( o1>=o2) {
			result++;
			o1 = o1-o2;
		}
		if(op1<0 && op2>0 || op1>0 && op2<0) {
			result = -result;
		}
		plusPlus();
		return result;
	}
	
	public int getAmountofCalls() {
		return amountOfCalls;
	}
	
	protected void plusPlus() {
		amountOfCalls++;
	}

}
