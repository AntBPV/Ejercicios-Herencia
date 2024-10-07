package cilindroPackage;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double leer_radio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(this.radio, 2);
		return area;
	}
	
	public double getCircunferencia() {
		double circunferencia = 2 * Math.PI * this.radio;
		return circunferencia;
	}
}
