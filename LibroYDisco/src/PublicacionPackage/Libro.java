package PublicacionPackage;

public class Libro extends Publicacion{
	private int numPaginas;
	private int yrPublicacion;
	
	// Constructor
	public Libro(String titulo, float precio, int numPaginas, int yrPublicacion) {
		super(titulo,precio);
		this.numPaginas = numPaginas;
		this.yrPublicacion = yrPublicacion;
	}
	
	// Getters and Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getYrPublicacion() {
		return yrPublicacion;
	}

	public void setYrPublicacion(int yrPublicacion) {
		this.yrPublicacion = yrPublicacion;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Titulo = "+this.getTitulo()+", Numero de paginas = "+this.numPaginas+", Año de publicacion = "+this.yrPublicacion+", Precio = "+this.getPrecio());
	}
}
