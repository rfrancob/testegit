package org.indracompany.testJunit.entidades.test;

import org.indracompany.testJunit.entities.Calculo;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculoTeste extends TestCase {

	@Test
	public void testExecultaCalculo() {
		float passaValor1 = 5;
		float passaValor2 = 5;
		float retornoEsperado = 10;

		float returnFeito = Calculo.execultaCalculo(passaValor1, passaValor2);
		assertEquals(retornoEsperado, returnFeito);

		passaValor1 = 10;
		passaValor2 = 10;
		retornoEsperado = 20;
		returnFeito = Calculo.execultaCalculo(passaValor1, passaValor2);
		assertEquals(retornoEsperado, returnFeito);
	}

}
