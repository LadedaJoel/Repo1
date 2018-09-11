package triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testCrearTriangulo() {
		
		Triangulo unTriangulo;
		unTriangulo = new Triangulo(10.0, 8.0, 8.0, 12.0);
		assertNotNull(unTriangulo);
	
		Triangulo otroTriangulo;
		otroTriangulo = new Triangulo(5.0, 4.0, 4.0, 6.0);
		assertNotNull(otroTriangulo);
		
	}

	@Test
	public void testPerimetroTriangulo() {
	
		Triangulo unTriangulo;
		unTriangulo = new Triangulo(10.0, 8.0, 8.0, 12.0);
		Double esperado = 26.0;
		Double actual = unTriangulo.calcularPerimetroTriangulo();
		assertEquals(esperado, actual);
		
	}
	
	@Test
	public void testAreaTriangulo() {
		
		Triangulo otroTriangulo;
		otroTriangulo = new Triangulo(5.0, 4.0, 4.0, 6.0);
		Double esperado = 15.0;
		Double actual = otroTriangulo.calcularAreaTriangulo();
		assertEquals(esperado, actual);
		
	}
	
	
	
	
	
}
