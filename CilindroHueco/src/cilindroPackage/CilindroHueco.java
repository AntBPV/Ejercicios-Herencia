package cilindroPackage;

public class CilindroHueco extends Cilindro{
	private double grosor;
	
	public CilindroHueco(double radio, double altura, double grosor) {
		super(radio,altura);
		this.grosor=grosor;
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	
	public double getRadioExterno() {
		double radioExterno = this.leer_radio() + this.grosor;
		return radioExterno;
	}
	
	@Override
	public double getCircunferencia() {
		double circunferencia = (2 * Math.PI * (this.getRadioExterno() - this.leer_radio()) + (2*Math.PI*this.getRadioExterno()*this.getAltura())
													+ (2*Math.PI*this.leer_radio()*this.getAltura()));
		return circunferencia;
	}
	
	@Override
	public double getVolumen() {
		double volumen = Math.PI * (this.getRadioExterno() - this.leer_radio()) * this.getAltura();
		return volumen;
	}
}
