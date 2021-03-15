package prLibreria;

public class Libro {

	private static double porcIVA = 10;
	private String autor;
	private String titulo;
	private double precioBase;
	
	public Libro(String autor, String titulo, double precio) {
		this.autor = autor;
		this.titulo = titulo;
		precioBase = precio;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public double getPrecioFinal() {
		return this.precioBase + (this.precioBase * porcIVA) / 100;
	}
	
	public static double getIVA() {
		return porcIVA;
	}
	
	public static void setIVA(double iva) {
		porcIVA = iva;
	}
	
	public String toString() {
		return "(" + this.autor + "; "+ this.titulo + "; "+ this.precioBase + "; " + porcIVA + "%; " + Math.round(this.getPrecioFinal()*100.0)/100.0 + ")";
	}
	
}
