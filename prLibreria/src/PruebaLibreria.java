import prLibreria.Libreria;

public class PruebaLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreria lib = new Libreria(); // Creamos la libreria con la que vamos a trabajar
		
		//A�adimos los libros que nos indican en el enunciado
		lib.addLibro("george orwell", "1984", 8.20);
		
		lib.addLibro("Philip K. Dick", "�Sue�an los androides con ovejas el�ctricas?", 3.50);
		lib.addLibro("Isaac Asimov", "Fundaci�n e Imperio", 9.40);
		lib.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
		lib.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
		lib.addLibro("Isaac Asimov", "La Fundaci�n", 7.30);
		lib.addLibro("William Gibson", "Neuromante", 8.30);
		lib.addLibro("Isaac Asimov", "Segunda Fundaci�n", 8.10);
		lib.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
		lib.addLibro("George Orwell", "1984", 6.20);
		lib.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		System.out.println(lib.toString()+"\n\n"); //Imprimimos por pantalla
		
		//Eliminamos los libros que nos indican en el enunciado
		
		lib.remLibro("George Orwell", "1984");
		lib.remLibro("Aldous Huxley", "Un Mundo Feliz");
		lib.remLibro("Isaac Newton", "Arithmetica Universalis");
		lib.remLibro("James Gosling", "The Java Language Specification");
		
		System.out.println(lib.toString()+"\n\n"); //Imprimimos por pantalla
		
		//A continuacion mostramos el prcio final de los libros que nos indican en el enunciado
		
		System.out.println( "PrecioFinal(George Orwell, 1984): " + lib.getPrecioFinal("George Orwell", "1984"));
		System.out.println( "PrecioFinal(Philip K. Dick, �Sue�an los androides con ovejas el�ctricas?): " + lib.getPrecioFinal("Philip K. Dick", "�Sue�an los androides con ovejas el�ctricas?"));
		System.out.println( "PrecioFinal(isaac asimov, fundaci�n e imperio): " + lib.getPrecioFinal("isaac asimov", "fundaci�n e imperio"));
		System.out.println( "PrecioFinal(Ray Bradbury, Fahrenheit 451): " + lib.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
		System.out.println( "PrecioFinal(Aldous Huxley, Un Mundo Feliz): " + lib.getPrecioFinal("Aldous Huxley", "Un Mundo Feliz"));
		System.out.println( "PrecioFinal(Isaac Asimov, La Fundaci�n): " + lib.getPrecioFinal("Isaac Asimov", "La Fundaci�n"));
		System.out.println( "PrecioFinal(william gibson, neuromante): " + lib.getPrecioFinal("william gibson", "neuromante"));
		System.out.println( "PrecioFinal(Isaac Asimov, Segunda Fundaci�n): " + lib.getPrecioFinal("Isaac Asimov", "Segunda Fundaci�n"));
		System.out.println( "PrecioFinal(Isaac Newton, Arithmetica Universalis): " + lib.getPrecioFinal("Isaac Newton", "Arithmetica Universalis") + "\n\n");
		
		
		
		
		
	}

}
