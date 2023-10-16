package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta aux;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux = new Cuenta("12345", "Angel", 50);
		aux2 = new Cuenta("67890", "Angel2", 0);
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		aux.ingresar(3000);
		System.out.println(aux.getSaldo());
		assertEquals(3000, aux.getSaldo());
	}
	
	@Test
	void testRetirar() {
		aux.ingresar(3000);
		aux.retirar(4000);
		assertEquals(3000, aux.getSaldo());
	}

}
