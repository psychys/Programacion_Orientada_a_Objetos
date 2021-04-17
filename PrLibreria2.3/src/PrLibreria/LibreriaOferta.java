package PrLibreria;


public class LibreriaOferta extends Libreria{

	private double descuento;
	private String[] autoresDescuento;
	
	public LibreriaOferta(double descuento, String[] autoresDescuento) {
		// TODO Auto-generated constructor stub
		super();
		this.descuento = descuento;
		this.autoresDescuento = autoresDescuento;
		
	}
	
	public LibreriaOferta(int capacidad, double descuento, String[] autoresDescuento) {
		// TODO Auto-generated constructor stub
		super(capacidad);
		this.descuento = descuento;
		this.autoresDescuento = autoresDescuento;
		
	}
	
	public void setOferta(double descuento, String[] autoresDescuento) {
		this.descuento = descuento;
		this.autoresDescuento = autoresDescuento;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	public String[] getOferta() {
		return this.autoresDescuento;
	}
	
	public void addLibro(String autor, String titulo, double precioBase) {
		boolean esta = false;
		int contador = 0;
		Libro libro = null;
		while(contador < this.contarDescuento() && !esta) {
			if(autoresDescuento[contador].equalsIgnoreCase(autor)) esta = true;
			contador++;
		}
		
		if(esta) {
			libro = new LibroOferta(autor, titulo, precioBase, this.descuento);
		}else {
			libro = new Libro(autor, titulo, precioBase);
		}
		
		super.anyadirLibro(libro);
	}
	
	private int contarDescuento() {
		int contador = 0;
		for(String autor : autoresDescuento) {
			if(autor != null)contador++;
		}
		return contador;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int contador = 0;
		sb.append(this.descuento + "%[");
		while(contador < this.contarDescuento()) {
			sb.append(autoresDescuento[contador] + ", ");
			contador++;
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]\n");
		
		
		return sb.toString() + super.toString();
	}

}
