package cap3OBasicoDeJava;

public class EscopoDeVariaveis {
	
	// variaveis locais
	public void exemploVariavelLocal(){
		String a = "";
	}
	
	public void m1() {
	    int x = 10; 
	    if (x >= 10) { 
	        int y = 50;  // Y somente acessada dentro do if 
	        System.out.print(y);
	    }
	} 
	
	//j so pode ser usado dentro do corpo do loop
	public static void main(String[] args) {
		for (int i = 0, j = 0; i < 10; i++) 
			 j++;
		
		// System.out.println(j); J esta fora do escopo do for
	}
	
	//Parametros de metodos - variaveis locais
	 public void m1(String s) { 
		 System.out.print(s);
	 }
	 public void m2() {
	        // System.out.println(s); // compilation error
	 }
	////////////////////////////////////////////////////////////////////
	 
	// Variáveis de instância
	 /*atributos de objetos*/
	 class Teste{
		 String nome;
		 
		 public void setNome(String nome){
			 this.nome = nome;
		 }
	 }
	 
	////////////////////////////////////////////////////////////////////
	// Variáveis estaticas
	/* Podemos declarar variáveis que são compartilhadas por todas as instancias 
	 * de uma classe usando a palavra chave static*/
	 
	 class Person {
		   static final int c = 15;
		   
		   //  final e static final
		   /* final int i;  
		    * 	terá um valor constante para a instância em que for declarado
		    * 
		    * static final int i;
		    * 	terá um valor constante até o termino da execução da VM
		    * */
		   
		//  static
		   /* static int id = 15;
		    *	variaveis estaticas nao precisam de referencia para serem acessadas
		    *
		    *  System.out.println(Person.id);
		    *
		    * */
	}
	 
	 
	// Variáveis com o mesmo nome
	/* */
	 public void method() {
		    int a = 0;
		    //int a = 10; compile error
	}
	 
	 //shadowing
	 public static class Test{
	    static int x = 0;
		int y = 0;
		
	    public void setX(int x) {
		    	Test.x = x; // type (class) explicit access
		}
	    public void setY(int y) {
		        this.y = y; // instance (this) explicit access
		} 
	 }
}
