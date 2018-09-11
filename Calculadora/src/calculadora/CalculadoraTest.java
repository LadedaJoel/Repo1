package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {

		Integer resultado = Calculadora.Suma(10, 8);
		Integer esperado = 18; // 10+8=18
		assertEquals(esperado, resultado);
		
	}

	@Test
	public void testResta() {
		
		Integer resultado = Calculadora.Resta(10, 8);
		Integer esperado = 2;
		assertEquals(esperado, resultado);
		
	}
	
}
