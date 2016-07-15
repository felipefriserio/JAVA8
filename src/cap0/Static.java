package cap0;

public class Static {
	
	/*
	 STATIC - variaveis e metodos estaticos podem ser acessadas diretamente, sem precisar instanciar uma classe.
	 Eles pertencem à classe, e nao a uma instancia dela.
	  
	  metodos static: 
	  	podem ser chamados sem uma instancia da classe. Mais utilizados como utilitarios
	  
	  atributos static: 
	  	possuem o mesmo valor para todas as instancias de um objeto (dentro da mesma JVM)
	  
	  classes static:
	  	sao classes declaradas dentro de outra classe que podem ser usadas sem a necessidade de uma instancia
	  
	 */
	
	static class ExemploStatic{
		static int exemplo = 0;
	}
	
	public static void main(String[] args) {
		System.out.println(ExemploStatic.exemplo);
	}

}
