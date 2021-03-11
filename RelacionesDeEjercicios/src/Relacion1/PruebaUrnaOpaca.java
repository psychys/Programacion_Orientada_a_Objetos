package Relacion1;

public class PruebaUrnaOpaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UrnaOpaca urnaOpaca = new UrnaOpaca();
		Urna urna = new Urna();
		
		urna.votar(true);
		urna.votar(true);
		urna.votar(true);
		urna.votar(false);
		urna.votar(false);
		
		System.out.println("Resultado de la votación en la urna normal: " + urna.resultado());
		
		urna.votar(false);
		urna.votar(false);
		
		System.out.println("Resultado de la votación en la urna normal: " + urna.resultado());
		
		urnaOpaca.votar(true);
		urnaOpaca.votar(true);
		urnaOpaca.votar(true);
		urnaOpaca.votar(false);
		urnaOpaca.votar(false);
		
		System.out.println("Resultado de la votación en la urna normal: " + urnaOpaca.resultado());
		
		urnaOpaca.votar(false);
		urnaOpaca.votar(false);
		
		System.out.println("Resultado de la votación en la urna normal: " + urnaOpaca.resultado());
		
		
		
	}

}
