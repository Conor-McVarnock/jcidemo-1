package uk.ac.qub.eeecs.dave;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		assertEquals(c.add(10,1), 11);
	}
	
	@Test
	void testSub() {
		Calculator c = new Calculator();
		assertEquals(c.sub(10,1), 9);
	}
	@Test
	void testMul() {
		Calculator c = new Calculator();
		assertEquals(c.mul(10,3), 30);
	}
	@Test
	void testDiv() {
		Calculator c = new Calculator();
		assertEquals(c.div(10,5), 2);
	}

}
