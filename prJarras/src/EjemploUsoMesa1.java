import prJarras.Mesa;

public class EjemploUsoMesa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mesa mesa = new Mesa(7,5);
		mesa.llena(2);
		System.out.println(mesa.toString());
		mesa.llenaDesde(2);
		System.out.println(mesa.toString());
		mesa.llena(2);
		System.out.println(mesa.toString());
		mesa.llenaDesde(2);
		System.out.println(mesa.toString());
		mesa.vacia(1);
		System.out.println(mesa.toString());
		mesa.llenaDesde(2);
		System.out.println(mesa.toString());
		mesa.llena(2);
		System.out.println(mesa.toString());
		mesa.llenaDesde(2);
		System.out.println(mesa.toString());
	}

}
