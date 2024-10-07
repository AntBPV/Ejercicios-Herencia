package PublicacionPackage;

public class Disco extends Publicacion{
	private float duracionMin;
	
	// Constructor
	public Disco(String titulo, float precio, float duracionMin) {
		super(titulo,precio);
		this.duracionMin = duracionMin;
	}
	
	// Getters and Setters
	public float getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(float duracionMin) {
		this.duracionMin = duracionMin;
	}
	
	// Print method
	@Override
	public void mostrar() {
		System.out.println("Titulo = "+this.getTitulo()+", Duracion(Minutos) = "+this.duracionMin+", Precio = "+this.getPrecio());
	}
}
