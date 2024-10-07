package NombrePackage;

public class Direccion extends Nombre{
	private String calle;
	private String ciudad;
	private String provincia;
	private int codigo_postal;
	
	public Direccion(String nombre, String primer_Apellido, String segundo_Apellido,
			String calle, String ciudad, String provincia, int codigo_postal) {
		super(nombre,primer_Apellido,segundo_Apellido);
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigo_postal = codigo_postal;
	}
	
	public void nueva_direccion(String calle, String ciudad, String provincia, int codigo_postal) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigo_postal = codigo_postal;
	}
	
	public void nuevo_nombre(String nombre,String primer_Apellido, String segundo_Apellido) {
		this.setNombre(nombre);
		this.setPrimer_Apellido(primer_Apellido);
		this.setSegundo_Apellido(segundo_Apellido);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	
	@Override
	public void mostrar() {
		this.leer_nombre();
		System.out.println("Calle = "+this.calle+", Ciudad = "+this.ciudad+", Provincia = "+this.provincia+", Codigo Postal = "+this.codigo_postal);
	}
}
