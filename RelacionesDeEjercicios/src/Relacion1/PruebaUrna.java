package Relacion1;

public class PruebaUrna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Urna urna = new Urna();
		
		urna.votar(true);
		urna.votar(true);
		urna.votar(true);
		urna.votar(false);
		urna.votar(false);
		
		System.out.println("Resultado de la votación: " + urna.resultado());
		
		urna.votar(false);
		urna.votar(false);
		
		System.out.println("Resultado de la votación: " + urna.resultado());
		
	}

}
