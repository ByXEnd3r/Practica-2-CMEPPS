package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		value1 = 3;
		value2 = 5;
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void testSuma() {
		int expected = 8;
		int actual = Calculadora.suma(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = -2;
		int actual = Calculadora.resta(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplicacion() {
		int expected = 15;
		int actual = Calculadora.multiplicacion(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivision() {
		int expected = 0;
		int actual = Calculadora.division(value1,value2);
		assertEquals(expected, actual);
	}

}
