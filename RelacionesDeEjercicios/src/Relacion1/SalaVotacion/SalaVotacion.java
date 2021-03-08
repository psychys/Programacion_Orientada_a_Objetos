package Relacion1.SalaVotacion;

import Relacion1.Urna.Urna;

public class SalaVotacion {

	private Urna urna1;
	private Urna urna2;
	
	public SalaVotacion() {
		urna1 = new Urna();
		urna2 = new Urna();
	}
	
	public SalaVotacion(Urna urna1, Urna urna2) {
		this.urna1 = urna1;
		this.urna2 = urna2;
	}
	
	
	/**
	 * 
	 * @param numero indica el número de la urna
	 * @param voto 
	 * @throws Exception; en este caso añadimos el lanzamiento de una excepcion en caso de que se 
	 * 					  indique una urna fuera de nuestro rango, no lo pide el ejercicio, pero tampoco está de más.
	 */
	public void votar(int numero, boolean voto) throws Exception {
		if(numero == 1) {
			urna1.votar(voto);
		}else if(numero == 2) {
			urna2.votar(voto);
		}else {
			throw new Exception();
		}
	}
	
	/**
	 * 
	 * @param numero
	 * @return devolvemos el resultado de la votacion
	 * @throws Exception -> en este caso añadimos el lanzamiento de una excepcion en caso de que se 
	 * 					  indique una urna fuera de nuestro rango, no lo pide el ejercicio, pero tampoco está de más.
	 */
	public boolean resultado(int numero) throws Exception {
		boolean result;
		if(numero == 1) {
			result = urna1.resultado();
		}else if(numero == 2) {
			result = urna2.resultado();
		}else {
			throw new Exception();
		}
		
		return result;
		
	}


	
}
