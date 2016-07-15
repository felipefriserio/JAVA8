package cap4TrabalhandoComTiposDeDados;

public class StringBuilderEStringBuffer {
	
	/*
	  StringBuilder/ StringBuffer:
	  		- Suporta Strings mutaveis, ele NAO CRIA novos objetos, mas ele altera o proprio StringBuffer.
	  		
	  StringBuilder e StringBuffer tem exatamente a mesma interface (mesmos métodos), sendo que a primeira 
	  eh thread-safe. Quando nao ha compartilhamento entre threads, use sempre que possivel StringBuilder,
	  que eh mais rapida por nao precisar se preocupar com locks.
	  
	  off: quando concatenamos String usando o +, por baixo dos panos, usamos um StringBuilder. 
	  
	  												
	 */
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		/* append 
		   permite concatenar no mesmo objeto
		   Existe um append que recebe um Object e chama o metodo toString()
		*/
		sb.append("Teste");
		sb.append(" - ");
		sb.append("Teste 2");
		
		System.out.println(sb);
		
		/*
		  insert
		  possivel inserir coisas no meio. Ha versoes que recebem tipos primitivos, String, arrays de char... etc
		  Mas todos tem o primeiro argumento recebendo o indice onde qeuremos inserir:
		*/
		sb.insert(0, "  ");
		System.out.println(sb);
		
		/*
		   delete
		   recebe o indice inicial e final 	
		 */
		sb.delete(0, 1);
		System.out.println(sb);
		
		/*
		  toString()
		  para converter um StringBuilder/Buffer em String
		  
		  reverse()
		  inverte o conteudo da mensagem:
		  guilherme -- > emrehliug
		  
		  outros metodos:
		  trim, charAt, length(), equals,indexOf, lastIndexOf, substring
		  
		  off: 
		  	subString() nao altera o valor do StringBuilder/Buffer, mas retorna a String que voce deseja.
		  	subSequence() semelhante ao subString(), mas com posicao de inicio e fim 
		  
		 */
		
		// ---------------------------------------------------------------------------
		
		StringBuilder sb1 = new StringBuilder();
		// conteudo inicial
		StringBuilder sb2 = new StringBuilder("java");
		
		// tamanho inicial do array para colocar a string
		StringBuilder sb3 = new StringBuilder(50);
		
		/*
		Tenha cuidado: ao definir o tamanho do array, não estamos criando uma
		String de tamanho definido, somente um array desse tamanho que será utilizado
		pelo StringBuilder, portanto:*/
		
		System.out.println(sb3);          // linha em branco
		System.out.println(sb3.length()); // 0
		
		// baseado em outro objeto do mesmo tipo
		StringBuilder sb4 = new StringBuilder(sb2);
		
		// possivel encadear, pois devolvem o proprio StringBuffer/Builder
		sb.append(" - conca").append("te").append("nou");
		
	}
	
	/*   	exercicios 4.6     
	 
	 1 - C / ERRO - E
	 		
	 		0 1 2 3 4 5 6 7 8
	 		G U I L H E R M E
	 		    ^ ^ 
	 			| |

	 		 inicia na 2 posicao e termina na terceira, mas nao exclui a 3.	
	 		
	 		retira somente o i
	 		sb.append("guilherme").delete(2,3);  // gulherme
	 		
	 2 - B / ERRO - A
	 	
	 		StringBuilder sb = new StringBuilder("guilherme");
			System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
			System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));  // retorna -1 quando nao encontra 
	 */
	
}
