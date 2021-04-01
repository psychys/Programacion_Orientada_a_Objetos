package prLibreria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Libreria {

	private static final int CAP_INICIAL = 8;
	private int numLibs;
	private Libro lb[];	//Nuestro array libreria para guardar los libros
	
	public Libreria() {
		numLibs = 0;
		lb = new Libro[CAP_INICIAL];
	}
	
	public Libreria(int capacidad) {
		numLibs = 0;
		if(capacidad <= 0) throw new RuntimeException("Capacidad negativa");
		lb = new Libro[capacidad];

	}
	
	public void addLibro(String autor, String titulo, double precio) {
		Libro lib = new Libro(autor,titulo,precio);
		anyadirLibro(lib);
		
	}

	/**
	 * Dependiendo de si exista o no el libro que queramos añadir en nuestra libreria ocurriran dos cosas:
	 * 
	 * En el caso de que no exista el libro buscamos la ultima posicion libre, si la hay añadimos el libro;
	 * si no hay posiciones libres, duplicamos el tamaño de la libreria y ahora si, guardamos el libro en la
	 * primera posicion libre.
	 * 
	 * Por otra parte, si el libro que queremos añadir ya esta en la libreria, solo lo sustituiremos por
	 * el nuevo
	 * 
	 * @param lib sera el libro que queramos añadir
	 */
	protected void anyadirLibro(Libro lib) {
		// TODO Auto-generated method stub
		
		int posicion = buscarLibro(lib.getAutor(), lib.getTitulo());
		if(posicion == -1) {
			if(numLibs == lb.length) {
				lb = Arrays.copyOf(lb, lb.length*2);
			}
			lb[numLibs] = lib;
			numLibs++;
		}else {
			lb[posicion] = lib;
		}
		
		
	}
	
	public void remLibro(String autor, String titulo) {
		int libro = buscarLibro(autor,titulo);
		if(libro != -1) {
			eliminarLibro(libro);
			numLibs--;
		}
	}
	
	/**
	 * Por ahora se me plantea el problema de querer borrar un libro en una libreria que no este
	 * completamente llena quedando asi un hueco vacio en nuestra libreria, cosa que no queremos.
	 * 
	 * 
	 * 
	 * @param pos sera la posicion del libro que queremos borrar de nuestra libreria
	 */
	private void eliminarLibro(int pos) {
		// TODO Auto-generated method stub
		int contador = 0;
		boolean parar = false;
		Libro aux;
		
		while((contador < lb.length) && !parar) {
			if(lb[contador] == null) {
				parar = true;
				contador--;
			}else {
				contador++;
			}
		}
		if(!parar) contador = lb.length-1;
		
		aux = lb[pos];
		lb[pos] = lb[contador];
		lb[contador] = null;
		lb[lb.length-1] = aux;
		lb = Arrays.copyOf(lb, lb.length-1);
		if(lb[pos] == null) {
			for(int i=pos; i<lb.length-1;i++) {
				lb[i] = lb[i+1];
			}
		}
		
	}

	/**
	 * Recorremos toda nuestra libreria hasta encontrar el libro que buscamos y guardamos su posicion
	 * 
	 * 
	 * @param autor
	 * @param titulo
	 * @return devolveremos la posicion del libro en cuestion (-1 si no existe)
	 */
	private int buscarLibro(String autor, String titulo) {
		// TODO Auto-generated method stub
		int esta = -1, contador = 0;
		if(numLibs != 0) {
		Libro libro = null;
			while((contador < numLibs) && (esta == -1)){
				libro = lb[contador];
					if((libro.getAutor().equalsIgnoreCase(autor) && (libro.getTitulo().equalsIgnoreCase(titulo)))){
						esta = contador;
					}else {
						contador++;
					}
			}
		}
		return esta;
	}
	
	public double getPrecioBase(String autor, String titulo)  {
		int posicion = buscarLibro(autor,titulo);
		double precio;
		if (posicion == -1) {
			precio = 0;
		}else {
			precio = lb[posicion].getPrecioBase();
		}
		return precio;
	}
	
	public double getPrecioFinal(String autor, String titulo)  {
		int posicion = buscarLibro(autor,titulo);
		double precio;
		if (posicion == -1) {
			precio = 0;
		}else {
			precio = lb[posicion].getPrecioFinal();
		}
		return precio;
	}
	
	public String toString() {
		int contador = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(contador < numLibs ) {
			sb.append(lb[contador].toString() + ",\n");
			contador++;
		}
		if(sb.length() > 2)sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}
	
}
