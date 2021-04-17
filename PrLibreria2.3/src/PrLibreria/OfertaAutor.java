package PrLibreria;

public class OfertaAutor implements OfertaFlex {

	private double porcDescuento;
	private String[] autoresOferta;
	
	public OfertaAutor(double porcDescuento, String[] autoresOferta) {
		this.porcDescuento = porcDescuento;
		this.autoresOferta = autoresOferta;
	}
	
	@Override
	public double getDescuento(Libro lib) {
		// TODO Auto-generated method stub
		double descuento = 0;
		for(int autor = 0; autor < contarDescuento() ; autor++) {
			if(autoresOferta[autor].equalsIgnoreCase(lib.getAutor())) descuento = this.porcDescuento;
		}
		return descuento;
	}
	
	private int contarDescuento() {
		int contador = 0;
		for(String autor : autoresOferta) {
			if(autor != null)contador++;
		}
		return contador;
	}
	
	public String toString() {
		String res ="" + this.porcDescuento + "%[";
		for(int autor = 0 ; autor < contarDescuento() ; autor++) {
			res += autoresOferta[autor].toString() +", ";
		}
		res = res.substring(0,res.length()-2);
		return res + "]\n";
	}

}
