package cap4TrabalhandoComTiposDeDados;

public class DiferencaVarDeReferenciaAObjetosETiposPrimitivos {
	static class Car {
		public int age;

		public int getAge() {
			return age;
		}
	}
	
	public static void main(String[] args) {
	/* Variaveis de tipos primitivos
	 de fato armazenam valores (e nao ponteiros/referencia). 
	 Ao se atribuir o valor de uma variavel primitiva a uma outra variavel, o valor eh copiado, e o original nao eh alterado.
	*/ 
		int a = 10;
		int b = a; // copiando o valor de a para b
		b++; // somando 1 em b
		System.out.println("1) Primitivos: "+a); // continua com 10.
		
	/* Variaveis de tipos primitivos
	 de fato armazenam valores (e nao ponteiros/referencia). 
	 Ao se atribuir o valor de uma variavel primitiva a uma outra variavel, o valor eh copiado, e o original nao eh alterado.
	*/ 
		Car car1 = new Car();
		Car car2 = car1; // agora car2 aponta para o mesmo objeto de car1
		
		car1.age = 5;
		
		System.out.println("2) Referencia: "+car2.age); // imprime 5

		
		
	//------------------------------------Comparacao-------------------------------------------
		
	/*
	 Duas referências só sao consideradas iguais se elas estiverem apontadas para o mesmo objeto.
	 Mesmo que o objeto e o conteudo sejam iguais 
	 */
		
	/*
	 == compara referencia;
	 .equals() compara referencia
	 
	  .equals() pode ser sobreescrito para comparar valores dos objetos
	  
	*/	
		Car car3 = new Car();
		car3.age = 10;
		
		Car car4 = new Car();
		car4.age = 10;
		
		Object car = car3;
		
		System.out.println(car3 == car4); //FALSE - Comparando valores iguais de objetos iguais, mas com referencias diferentes
		System.out.println(car == car3);  //TRUE  - Objetos iguais, valores iguais e mesma referencia
		
		System.out.println(car3.equals(car4));
		
		
		
		
		/*								EXERC 4.2
		 1 - E; ok 
		 2 - G; ERRO - criamos apenas um unico objetoç
		*/ 
		
		int x = 15;
		int y = x; // y =15
		y++; // y = 16
		x++; // x = 16
		int z = y; // z = 16
		
		z--; // z = 15
		
		System.out.println( x + y + z); // 47
		
		
		
		//Y = 15
		//X = 16 / Y = 16
		//Z = 17
		//Z = 16
		
		//X = 16; Y = 16; Z = 16
		
		
		
	}
	
}
