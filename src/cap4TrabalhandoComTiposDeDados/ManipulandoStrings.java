package cap4TrabalhandoComTiposDeDados;

public class ManipulandoStrings {

	/*
	  
	 - Criaçao de String
	 		String implicit = "Java";				// forma implicita
	 		String Explicit = new String("Java");	// forma explicita  
	 
	 - Strings sao imutaveis <<----
	 
	 - String nao eh tipo primitivo, portanto, pode ter valor null.
	 
	 - Podemos concatenar com +
	 		String name = "Java" + " " + "Exam";
	 
	 */
	
	public static void main(String[] args) {
		// caso tente concatenar null com String
		String nulled = null;
		System.out.println("value: " + nulled); // value: null

		// Java faz a conversao de tipos primitivos automaticamente
		String name = "Java" + " " + "Certification" + " " + 1500;
		System.out.println(name); // Java Certification 1500
		
		
		String s = "caelum";
		
		s.toUpperCase();      // nao altera a String origial
		System.out.println(s);
		
		String s2 = s.toUpperCase();
		System.out.println(s2); // CAELUM     nova String
		
		String s3 = "caelum";
		s3 = s3.toUpperCase();
		System.out.println(s);  // CAELUM      nova String
		
		
		
	}
	
}
