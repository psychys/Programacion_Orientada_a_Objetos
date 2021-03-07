package prJarras;

public class Mesa {

	private Jarra j1;
	
	private Jarra j2;
	
	public Mesa(int capacidad1, int capacidad2) {
		
		j1 = new Jarra(capacidad1);
		j2 = new Jarra(capacidad2);
		
	}
	
	public Mesa(Jarra j1, Jarra j2) {
		
		if(j1 != j2) {
			this.j1 = j1;
			this.j2 = j2;
		}else {
			throw new RuntimeException();
		}
	}

	public int capacidad(int id) {
		int cap;
		if(id == 1) {
			cap = j1.capacidad();
		}else if(id == 2) {
			cap = j2.capacidad();
		}else {
			throw new RuntimeException();
		}
		
		return cap;
	}
	
	public int contenido(int id) {
		int cap;
		if(id == 1) {
			cap = j1.contenido();
		}else if(id == 2) {
			cap = j2.contenido();
		}else {
			throw new RuntimeException();
		}
		
		return cap;
	}
	
	public void llena(int id) {
		
		if(id == 1) {
			j1.llena();
		}else if(id == 2) {
			j2.llena();
		}else {
			throw new RuntimeException();
		}

	}
	
	public void vacia(int id) {
		
		if(id == 1) {
			j1.vacia();
		}else if(id == 2) {
			j2.vacia();
		}else {
			throw new RuntimeException();
		}

		}

	public void llenaDesde(int id) {
		if(id == 1) {
			j2.llenaDesde(j1);
		}else if(id == 2) {
			j1.llenaDesde(j2);
		}else {
			throw new RuntimeException();
		}
	}
	
	public String toString() {
		return "M("+j1.toString()+", "+j2.toString()+")";
	}

}
