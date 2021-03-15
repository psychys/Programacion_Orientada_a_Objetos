package Relacion2.prPlano;

public class Segmento {

	private Punto p1;
	private Punto p2;
	
	/**
	 * Inicializamos un segmento con los dos puntos a cero
	 */
	public Segmento() {
		this.p1.setAbscisas(0);
		this.p2.setAbscisas(0);
		this.p1.setOrdenadas(0);
		this.p2.setOrdenadas(0);
	}
	
	/**
	 * Inicializamos los dos puntos a partir de los parametros que nos dan
	 * @param abscisas1
	 * @param ordenadas1
	 * @param abscisas2
	 * @param ordenadas2
	 */
	public Segmento(double abscisas1, double ordenadas1, double abscisas2, double ordenadas2) {
		this.p1.setAbscisas(abscisas1);
		this.p2.setAbscisas(abscisas2);
		this.p1.setOrdenadas(ordenadas1);
		this.p2.setOrdenadas(ordenadas2);
	}
	
	/**
	 * Creamos un segmento a partir de los puntos que nos dan
	 * @param p1
	 * @param p2
	 */
	public Segmento(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double longitud() {
		return this.p1.distancia(this.p2);
	}
	
	public void desplazar(double abscisas, double ordenadas) {
		this.p1.desplazar(abscisas, ordenadas);
		this.p2.desplazar(abscisas, ordenadas);
	}
	
	public String toString() {
		return "((" + p1.getAbscisas() + ", " + p1.getOrdenadas() + "), ("+ p2.getAbscisas() + ", " + p2.getOrdenadas() + "))";
	}
	
	
}
