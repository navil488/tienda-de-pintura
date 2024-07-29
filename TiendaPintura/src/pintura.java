
public class pintura {

	public pintura() {
		// TODO Auto-generated constructor stub
		codigo ="";
		color =new Color();
		tipopintura = new TipoPintura();
	}

	private String codigo;
	private Color color;
	private TipoPintura tipopintura;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public TipoPintura getTipopintura() {
		return tipopintura;
	}
	public void setTipopintura(TipoPintura tipopintura) {
		this.tipopintura = tipopintura;
	}
	
	
	
	
}
