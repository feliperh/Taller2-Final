package com.edu.sergioarboleda.DISPENSADOR;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {

	@Test
	public void testDeberiaDar1sisolo1() {
		String entrada = "1";
		Adder adder = new Adder();
		int resultado = adder.obtenerSuma(entrada);
		assertEquals(1,resultado);	
	}

}
