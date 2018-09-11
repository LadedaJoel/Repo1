package triangulo;

public class Triangulo {

	private Double baseA, ladoB, ladoC, altura;
	
	public Triangulo (Double baseA, Double ladoB, Double ladoC, Double altura) {
		this.baseA=baseA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
		this.altura=altura;	

		}
	
	public Double calcularAreaTriangulo() {
		Double area = (baseA*altura)/2;
		return area;
	}

	public Double calcularPerimetroTriangulo() {
		Double area = baseA + ladoB + ladoC;
		return area;
	}



}
