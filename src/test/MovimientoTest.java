package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class MovimientoTest {

	static Cuenta aux;
	static Cuenta aux2;
	
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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReintegro1() {
		aux.retirar(200);
		Movimiento m1 = new Movimiento(-200, "D", "Quitamos 200");
		aux.ingresar(100);
		Movimiento m2 = new Movimiento(100, "D", "Ingresamos 100");
		aux.retirar(200);
		Movimiento m3 = new Movimiento(-200, "D", "Quitamos 200");
		assertEquals(aux.getSaldo(),m1.Reintegro()+m2.Reintegro()+ m3.Reintegro());
	}
	
	@Test
	void testReintegro2() {
		aux2.retirar(350);
		Movimiento m1 = new Movimiento(-350, "D", "Quitamos 350");
		aux2.retirar(150);
		Movimiento m2 = new Movimiento(100, "D", "Quitamos 150");
		aux2.ingresar(50);
		Movimiento m3 = new Movimiento(-200, "D", "Ingresamos 50");
		assertEquals(-450, aux2.getSaldo());
		assertEquals(aux.getSaldo(),m1.Reintegro()+m2.Reintegro()+ m3.Reintegro());
	}

}
