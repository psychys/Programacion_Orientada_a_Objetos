package Relacion2.prPlano;

public class Punto {

	private double abscisas;
	private double ordenadas;
	
	public Punto() {
		this.abscisas = 0;
		this.ordenadas = 0;
	}
	
	public Punto(double abscisas, double ordenadas) {
		this.abscisas = abscisas;
		this.ordenadas = ordenadas;
	}
	
	public double getAbscisas() {
		return this.abscisas;
	}
	
	public double getOrdenadas() {
		return this.ordenadas;
	}
	
	public void setAbscisas(double abscisas) {
		this.abscisas = abscisas;
	}
	
	public void setOrdenadas(double ordenadas) {
		this.ordenadas = ordenadas;
	}
	
	public void desplazar(double abscisas, double ordenadas) {
		this.abscisas += abscisas;
		this.ordenadas += ordenadas;
	}
	
	public double distancia(Punto p) {
		return Math.hypot(this.abscisas - p.getAbscisas(), this.ordenadas - p.getOrdenadas());
	}
	
	public String toString() {
		return "(" + this.abscisas + ", " + this.ordenadas + ")"; 
	}
}
