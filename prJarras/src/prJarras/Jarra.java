package prJarras;

public class Jarra {

	private final int capacidad;
	
	private int contenido = 0;
	
	public Jarra(int capacidad) {
		if(capacidad > 0) {
			this.capacidad = capacidad;
		}else {
			throw new RuntimeException(); 
				
		}
	}
	
	public int capacidad() {
		return this.capacidad;
	}
	
	public int contenido() {
		return this.contenido;
	}
	
	public void llena() {
		this.contenido = this.capacidad;
	}
	
	public void vacia() {
		this.contenido = 0;
	}
	
	public void llenaDesde(Jarra j1) {
		if(this != j1 ) {
			if((this.capacidad > j1.contenido) && (this.contenido == 0)) {
				this.contenido = j1.contenido;
				j1.contenido = 0;
		
			}else {
				
				if((this.contenido + j1.contenido())>(this.capacidad())) {
					j1.contenido = j1.contenido-(this.capacidad - this.contenido);
					this.llena();
					
				}else {
					this.contenido+=j1.contenido;
					j1.vacia();
				}
	
			}
		}else {
			throw new RuntimeException();
		}
		
		
	}
	
	public String toString() {
		return "J("+this.capacidad+", "+this.contenido+")";
	}
	
}
