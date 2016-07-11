package cap3OBasicoDeJava;

public class ExecutaveisLinhaDeComando {

	// MAIN
	/* main precisa ser
	 * - public
	 * - static 
	 * - void 
	 * - ter o nome main
	 * - receber como parametro um array ou varargs de String (String[] ou String...)
	 * 
	 * */
	
	
	/*
	 * Exemplos de main:
	 *  
	 * // padrao
	 * public static void main (String[] args) {}    
	 * 
	 * // ... ok
	 * public static void main (String... args) {}   
	 * 
	 * // comecando com static ok
	 * static public void main(String[] args) {}     
	 * 
	 * // nome do argumento diferente de args ok
	 * public static void main (String... listOfArgumentsOurUserSentUs){}    
	 * 
	 * // args como array ok
	 * public static void main (String args[]) {}     
	 * */
	
	
	/*
	 * Para compilar uma classe java pelo CMD.
	 * O compilamento eh feito pelo JDK. A Leitura do .class, do bytecode gerado pelo compilamento eh feito pela JVM
	 * 
	 * para compilar:
	 * javac caminho1/caminho2/NomeDaClasse.java
	 * 
	 * 
	 * para executar classe:
	 * java caminho1.caminho2.NomeDaClasse
	 * 
	 * */
	
	
	/*
	 * // Passando propriedades/ parametros e argumentos pela linha de comando
	 *
	 * -D eh o identificador que define que a a chave. O -D  nao faz parte da chave
	 *
	 * 
	 * Propriedade/ parametro: chave = abc e chave2 = def
	 * Argumento = arg1 e arg2
	 * 
	 * java -Dchave=abc -Dchave2=def NomeDaClasse arg1 arg2
	 * 
	 * Exemplo impressao de argumento:
	 * 
	 * 	public static void main (String[] args) {
	 * 		System.out.println(args[0]); // arg1
	 *  	System.out.println(args[1]); // arg2
	 * 	} 
	 * 
	 * */
}
