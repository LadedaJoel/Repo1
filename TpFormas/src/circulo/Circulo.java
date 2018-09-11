package circulo;

public class Circulo {

	Double radio;

	public Circulo(Double radio) {

		this.radio = radio;

	}

	public Double calcularArea() {
		Double area = 3.14 * (radio * radio);
		return area;

	}

	public Double calcularPerimetro() {
		Double perimetro = 2 * 3.14 * radio;
		return perimetro;

	}

}
