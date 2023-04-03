package telran.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exampleTest {

	@Test
	void testBase() {
		int ini = 2;
		Operations b = new Base(ini);
		assertEquals(5, b.sum(3,2));
		assertEquals(2, b.substruct(3,  1));
		assertEquals(6, b.multiply(2, 3));
		assertEquals(2, b.divide(4, 2));
		assertEquals(ini + 4, b.getAmountofCalls());
	}

	@Test
	void testDerived1() {
		int ini = 3;
		Operations d = new Derived1(ini);
		assertEquals(5, d.sum(3,2));
		assertEquals(2, d.substruct(3,  1));
		assertEquals(6, d.multiply(2, 3));
		assertEquals(2, d.divide(4, 2));
		assertEquals(ini + 4, d.getAmountofCalls());
	}

	@Test
	void testDerived2() {
		Operations d = new Derived2();
		assertEquals(5, d.sum(3,2));
		assertEquals(2, d.substruct(3,  1));
		assertEquals(6, d.multiply(2, 3));
		assertEquals(2, d.divide(4, 2));
		assertEquals(4, d.getAmountofCalls());
	}

}
