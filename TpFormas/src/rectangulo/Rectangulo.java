package rectangulo;

public class Rectangulo {

	private Double base;
	private Double altura;

	public Rectangulo(Double base, Double altura) {

		this.base = base;
		this.altura = altura;

	}

	public Double calcularAreaRectangulo() {
		Double area = base * altura;
		return area;

	}

	public Double calcularPerimetroRectangulo() {
		Double perimetro = 2 * (base + altura);
		return perimetro;
	}

}
