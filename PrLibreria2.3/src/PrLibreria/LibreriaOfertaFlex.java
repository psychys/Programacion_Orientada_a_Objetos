package PrLibreria;

public class LibreriaOfertaFlex extends Libreria{

	private OfertaFlex oferta;
	
	public LibreriaOfertaFlex(OfertaFlex oferta) {
		super();
		this.oferta = oferta;
	}
	
	public LibreriaOfertaFlex(int capacidad, OfertaFlex oferta) {
		super(capacidad);
		this.oferta = oferta;
	}
	
	public void setOferta(OfertaFlex oferta) {
		this.oferta = oferta;
	}
	
	public void addLibro(String autor, String titulo, double precio) {
		Libro lib = new Libro(autor,titulo,precio);
		if(this.oferta.getDescuento(lib) != 0) {
			LibroOferta ofertado = new LibroOferta(autor,titulo,precio,this.oferta.getDescuento(lib));
			super.anyadirLibro(ofertado);
		}else {
			super.anyadirLibro(lib);
		}
	}
	
	public String toString() {
		String result = "";
		
		result += this.oferta.toString();
		
		return result + super.toString();
	}
}
