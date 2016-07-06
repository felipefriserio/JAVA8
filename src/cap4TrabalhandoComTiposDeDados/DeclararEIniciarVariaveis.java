package cap4TrabalhandoComTiposDeDados;

public class DeclararEIniciarVariaveis {
	public static void main(String[] args) {
		
	/* 
	   Declarar variaveis -> tipo e nome
		I
		I-> Por esse motivo java é uma linguagem explicitamente tipada, pois todas as variaveis
		  precisam ter o seu tipo definido
		
		Todas as variaveis PRECISAM ser iniciadas antes de serem iniciadas.
		
			1 inicializacao explicita 
				variaveis dentro de metodos/ construtores
				
				int x = 0;
				
			2 inicializacao	implicita
				- variaveis membros de uma classe sao implicitamente iniciadas
				- na criacao de arrays
				
				class Exam {
     				double timeLimit; // implicit initialization: 0.0
     			}
     			
     			int[] numbers = new int[10];
				System.out.println(numbers[0]); // 0
		
		
		
		Valores default das variaveis:
			primitivos inteiros         = 0;
			primitivos ponto flutuante  = 0.0;
			boolean                     = false;
			char 						= vazio, equivalente a 0;
			referencias                 = null;
			
		
			
		Tipos Primitivos: Temos 8 tipos primitivos
			byte 
			short 
			char 
			int  
			long 
			float     -- ponto flutuante
			double    -- ponto flutuante
			boolean   -- unico nao numerico
			
		Tamanhos dos inteiros:
			
			- byte 			(8 bits, de -128 a 127);
			- short 2 bytes (16 bits, de -32.768 a 32.767);
			- char 2 bytes  (só positivo),(16 bits, de 0 a 65.535);
			- int 4 bytes   (32 bits, de -2.147.483.648 a 2.147.483.647);
			- long 8 bytes  (64 bits, de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808)
		
		Tamanhos dos pontos flutuantes:
			- float 4 bytes  (32 bits, de +/- 1.4 * 10ˆ45 a +/- 3.4028235 * 10 ˆ 38);
			- double 8 bytes (64 bits, de +/- 4.9 * 10ˆ324 a +/-1.7976931348623157*10ˆ308);
			
			todos os numeros de ponto flutuante tambem podem assumir os seguintes valores:
			- +/- infinity
			- +/- 0;
			- NaN (Not a Number);
			
			
		Valor literal = quando colocado valor da variavel direto no codigo fonte;
		
		Ao declarar uma variavel, podemos explicitar o tipo que queremos que ela seja
		
	*/
		// compila pois 737821237891232 é um double válido
		System.out.println(737821237891232d); // usando D
		// compila pois 737821237891232 é um long válido
		System.out.println(737821237891232l); // usando L
		
		// não compila pois 737821237891232 é um valor maior que
		// o int aceita
		System.out.println(737821237891232);
		
		// compila pois 737821237891232l é um long válido
		long l = 737821237891232l;
		// não compila pois o compilador não é bobo assim
		int i = l;
		
		// boolean
		System.out.println(true); // booleano verdadeiro
		System.out.println(false); // booleano falso
		
		// números simples são considerados inteiros
		System.out.println(1); // int
		
		// números com casa decimal são considerados double.
		// Também podemos colocar uma letra "D" ou "d" no final
		System.out.println(1.0); //double
		System.out.println(1.0D); //double
		
		// números inteiros com a letra "L" ou "l"
		// no final são considerados long.
		System.out.println(1L); //long
		
		// números com casa decimal com a letra "F" ou "f"
		// no final são considerados float.
		System.out.println(1.0F); //float
fe
		// ----------------------------------------------------------
		
		/* 		----------	Bases Diferentes ----------	
		  
		  						Num inteiros 
		  podem ser declarados usando bases diferentes.
		  
		  Bases suportadas: decimal, octal, hexadecimal e binaria.
		*/
		
		/*		Octal
		0 à esquerda
		suporta nums de 0 a 7 
		*/
		int a = 0761; 			// octal
		System.out.println(a);  // 497 inteiros
		
		/*		Hexadecimal
		comeca com 0x ou 0X  
		suporta 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E e F
		*/
		int j = 0xAB3400;      // hexadecimal
		System.out.println(j); // 11219968
		
		
		/*		Binario
		comeca com 0b  
		suporta 0 e 1
		*/
		int b = 0b100001011; // binary
		System.out.println(b); // 267
		
	
		
		 /*
		 						Notacao cientifica
		 ao declarar doubles ou floats, podemos usar a notacao cientifica
		 
		 */
		
		double d = 3.1E2;
		System.out.println(d); // 310.0
		
		float e = 2e3f;
		System.out.println(e); // 2000.0
		
		float f = 1E4F;
		System.out.println(f); // 10000.0
	}
}
