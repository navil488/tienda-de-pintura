
public class Trabajador {

	public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	
	private String codigo;
	private String nombre;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void atender(pintura Pintura) {
		System.out.println("Se atendioa al cliente"+Pintura.getCodigo()+" de color "+pintura.getColor().getnombre()+"de tipo"+pintura.getTipoPintura().getnombre());
	
	

}
