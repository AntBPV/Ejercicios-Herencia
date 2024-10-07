package cilindroPackage;

public class Cilindro extends Circulo{
	private double altura;
	
	public Cilindro(double radio, double altura) {
		super(radio);
		this.altura=altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		double area = (2 * Math.PI * this.leer_radio()) + (2*Math.PI*Math.pow(this.leer_radio(), 2));
		return area;
	}
	
	public double getVolumen() {
		double volumen = Math.PI * Math.pow(this.leer_radio(), 2) * this.altura;
		return volumen;
	}
}
