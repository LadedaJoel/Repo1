package circulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testCrearCiruculo() {

		Circulo unCirculo;
		unCirculo = new Circulo(7.0);
		assertNotNull(unCirculo);

		Circulo otroCirculo;
		otroCirculo = new Circulo(3.0);
		assertNotNull(otroCirculo);
	}

	@Test
	public void testPerimetroCirculo() {

		Circulo unCirculo;
		unCirculo = new Circulo(7.0);
		Double esperado = 7.0 * 3.14 * 2;
		Double actual = unCirculo.calcularPerimetro();
		assertEquals(esperado, actual);
	}

	@Test
	public void testAreaCirculo() {

		Circulo otroCirculo;
		otroCirculo = new Circulo(7.0);
		Double esperado = 3.14 * 7.0 * 7.0;
		Double actual = otroCirculo.calcularArea();
		assertEquals(esperado, actual);

	}

}
