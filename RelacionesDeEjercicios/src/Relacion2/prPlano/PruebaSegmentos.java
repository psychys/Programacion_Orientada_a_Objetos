package Relacion2.prPlano;

public class PruebaSegmentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto (2,3);
		Punto p2 = new Punto (5,6);
		
		Segmento segmento = new Segmento(p1,p2);
		
		System.out.println(segmento.toString());
		
		segmento.desplazar(5, 4);
		
		System.out.println(segmento.toString());
	}

}
