package Relacion1;


public class UrnaOpaca extends Urna{

	private boolean estadoVotacion;
	
	public UrnaOpaca()  {
		// TODO Auto-generated constructor stub
		super();
		this.estadoVotacion = true;
		
	}
	
	public boolean estaAbierta() {
		return this.estadoVotacion;
	}
	
	public void cerrarVotacion() {
		this.estadoVotacion = false;
	}
	
	
	/**
	 * En este caso, solo tendremos que considerar el estado de la urna, si esta abierta llamamos a la super clase (o clase padre), 
	 * que en este caso es la clase Urna e introduciremos el voto; en caso contrario se desecha.
	 * @param voto
	 */
	public void votar(boolean voto) {
		if(estadoVotacion)super.votar(voto);
	}

	/**
	 * Comenzamos cerrando la urna para evitar que se introduzcan mas votos y a continuación, volvemos a llamar a la super clase
	 * y utilizamos su metodo resultado().
	 * @return
	 */
	public boolean resultado() {
		this.cerrarVotacion();
		return super.resultado();
	}
	
}
