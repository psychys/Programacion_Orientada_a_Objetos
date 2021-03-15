package Relacion2.prCalculos;

public class PruebaRacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumeroRacional n1 = new NumeroRacional(3,6);
		System.out.println("Numero 1 = " + n1.toString());

		NumeroRacional n2 = new NumeroRacional(3,12);
		System.out.println("Numero 2 = " + n2.toString());
		
		System.out.println(n1.toString() + " + " + n2.toString() + " = " + n1.suma(n2).toString() );
		
		System.out.println(n1.toString() + " - " + n2.toString() + " = " + n1.resta(n2).toString() );
		
		System.out.println(n1.toString() + " * " + n2.toString() + " = " + n1.mult(n2).toString() );
		
		System.out.println(n1.toString() + " / " + n2.toString() + " = " + n1.div(n2).toString() );
		
		
	}

}
