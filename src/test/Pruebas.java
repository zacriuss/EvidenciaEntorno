package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

/**
 * 
 * @author Adolfo
 * @since 1.0
 * @version 6.8
 *
 */

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();
	@Test
	void test() {
	cb.agregarSaldo(2000);
		assertEquals(2000, cb.obtenerSaldo());
	}
	
	@Test
	void test2() throws Exception {
	cb.modificarCredito(1000);
		assertEquals(1000, cb.obtenerSaldo());
	}
	
	@Test
	void test3() {
	cb.agregarSaldo(1000);
		assertEquals(1000, cb.obtenerSaldo());
	}

	
	
}
