
public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Color color = new Color();
        color.setNombre("amarillo");
        TipoPintura tipoPintura = new TipoPintura();
        tipoPintura.setNombre("Agua");
        pintura Pintura = new pintura();
        Pintura.setCodigo("00001");
        Pintura.setColor(color);
        pintura.setTipoPintura(tipoPintura);
      
        
       Trabajador juan = new Trabajador ();
       juan.setCodigo("001");
       juan.setNombre("juan Perez");
       juan.atender(Pintura);

	}

}
