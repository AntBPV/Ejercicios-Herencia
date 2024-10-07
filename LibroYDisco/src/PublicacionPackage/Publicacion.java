package PublicacionPackage;

public class Publicacion {
	private String titulo;
	private float precio;
	
	// Constructor
	public Publicacion(String titulo, float precio) {
		this.titulo = titulo;
		this.precio = precio;
	}

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	// Print Method
	public void mostrar() {
		System.out.println("Titulo = "+this.titulo+", Precio = "+this.precio);
	}
}
