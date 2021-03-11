package Relacion1;

public class PruebaSalaVotacion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SalaVotacion salita = new SalaVotacion();
		
		salita.votar(1, true);
		salita.votar(1, true);
		salita.votar(1, false);
		
		salita.votar(2, false);
		salita.votar(2, false);
		salita.votar(2, true);
		
		System.out.println("Resultados de la votacion en la primera urna: " + salita.resultado(1));
		System.out.println("Resultados de la votacion en la segunda urna: " + salita.resultado(2));
		
	}

}
