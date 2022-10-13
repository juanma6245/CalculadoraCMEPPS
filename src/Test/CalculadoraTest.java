package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

class CalculadoraTest {
	
	private int v1;
	private int v2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		v1 = 10;
		v2 = 5;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		int total = 15;
		int suma = Calculadora.suma(v1, v2);
		assertEquals(suma, total);
	}
	
	@Test
	void testFallaSuma() {
		int total = 1;
		int suma = Calculadora.suma(v1, v2);
		assertNotEquals(suma, total);
	}

	@Test
	void testResta() {
		int total = 5;
		int resta = Calculadora.resta(v1, v2);
		assertEquals(resta, total);
	}
	
	@Test
	void testFallaResta() {
		int total = 0;
		int resta = Calculadora.resta(v1, v2);
		assertNotEquals(resta, total);
	}

	@Test
	void testMultiplica() {
		int total = 50;
		int multiplica = Calculadora.multiplica(v1, v2);
		assertEquals(multiplica, total);
	}
	
	@Test
	void testFallaMultiplica() {
		int total = 1;
		int multiplica = Calculadora.multiplica(v1, v2);
		assertNotEquals(multiplica, total);
	}

	@Test
	void testDivide() {
		int total = 2;
		int divide = Calculadora.divide(v1, v2);
		assertEquals(divide, total);
	}
	
	@Test
	void testFallaDivide() {
		int total = 1;
		int divide = Calculadora.divide(v1, v2);
		assertNotEquals(divide, total);
	}

}
