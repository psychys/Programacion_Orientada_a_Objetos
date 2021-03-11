package Relacion1;

public class Urna {

	private int votosPositivos;
	private int votosNegativos;
	
	public Urna() {
		votosPositivos = 0;
		votosNegativos = 0;
	}
	
	public void votar(boolean voto) {
		if(voto) {
			this.votosPositivos++;
		}else {
			this.votosNegativos++;
		}
	}
	
	public boolean resultado() {
		return this.votosPositivos >= this.votosNegativos;
	}
}
