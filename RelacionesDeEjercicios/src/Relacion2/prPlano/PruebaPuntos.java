package Relacion2.prPlano;

public class PruebaPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Punto p1 = new Punto(2,3);
		Punto p2 = new Punto(5,6);
		
		System.out.println("La distancia entre ambos puntos es: " + p1.distancia(p2));
		
		//p2.setAbscisas(2);
		//p2.setOrdenadas(3);
		
		p2.desplazar(-3, -3);
		
		System.out.println("La distancia entre ambos puntos es: " + p1.distancia(p2));
		
	}

}
