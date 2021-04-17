package PrLibreria;

public class LibroOferta extends Libro{
	
	private double descuento;

	public LibroOferta(String autor, String titulo, double precioBase, double descuento) {
		// TODO Auto-generated constructor stub
		super(autor,titulo,precioBase);
		this.descuento = descuento;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	public double getPrecioFinal() {
		
		double precio = this.getPrecioBase() - ((this.getPrecioBase() * this.descuento) / 100);
		return precio + (precio * this.getIVA()) / 100; 
	}

	public String toString() {
		double precio = this.getPrecioBase() - ((this.getPrecioBase() * this.descuento) / 100);
		return "(" + this.getAutor() + "; " + this.getTitulo() + "; " + this.getPrecioBase() + "; " + this.getDescuento() + "%; " + String.valueOf(precio) + "; " + this.getIVA() + "%; " + this.getPrecioFinal() + ")";
	}
	
}
