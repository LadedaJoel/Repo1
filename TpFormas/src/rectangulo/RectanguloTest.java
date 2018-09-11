package rectangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testCrearRectangulos() {

		Rectangulo unRectangulo;
		unRectangulo = new Rectangulo(1.0, 2.0);
		assertNotNull(unRectangulo);

		Rectangulo otroRectangulo;
		otroRectangulo = new Rectangulo(4.0, 5.0);
		assertNotNull(otroRectangulo);

	}

	@Test
	public void testPerimetroRectangulo() {

		Rectangulo unRectangulo;
		unRectangulo = new Rectangulo(4.0, 2.0);
		Double esperado = 12.0;
		Double actual = unRectangulo.calcularPerimetroRectangulo();
		assertEquals(esperado, actual);
		
	}

	@Test
	public void testAreaRectangulo() {
		
		Rectangulo otroRectangulo;
		otroRectangulo = new Rectangulo(10.0, 4.0);
		Double esperado = 40.0;
		Double actual = otroRectangulo.calcularAreaRectangulo();
		assertEquals(esperado, actual);
		
	}
	
	
	
}

