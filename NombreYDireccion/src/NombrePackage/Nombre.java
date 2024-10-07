package NombrePackage;

public class Nombre {
	private String nombre;
	private String primer_Apellido;
	private String segundo_Apellido;
	
	public Nombre(String nombre, String primer_Apellido, String segundo_Apellido) {
		this.nombre = nombre;
		this.primer_Apellido = primer_Apellido;
		this.segundo_Apellido = segundo_Apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_Apellido() {
		return primer_Apellido;
	}

	public void setPrimer_Apellido(String primer_Apellido) {
		this.primer_Apellido = primer_Apellido;
	}

	public String getSegundo_Apellido() {
		return segundo_Apellido;
	}

	public void setSegundo_Apellido(String segundo_Apellido) {
		this.segundo_Apellido = segundo_Apellido;
	}
	
	public void leer_nombre() {
		System.out.println(this.nombre+" "+this.primer_Apellido+" "+this.segundo_Apellido);
	}
	
	public void mostrar() {
		System.out.println("Nombre = "+this.nombre+", Primer Apellido = "+this.primer_Apellido+", Segundo Apellido = "+this.segundo_Apellido);
	}
}
