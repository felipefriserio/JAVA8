package cap4TrabalhandoComTiposDeDados;

public class ChamandoMetodosEmObjetos {
	
	public static void main(String[] args) {
		ChamandoMetodosEmObjetos cmeo = new ChamandoMetodosEmObjetos();
		
		Person p = cmeo.new Person();
		
		//chamando metodo na variavel de ref.
		p.setName("Tobias"); 
		
		//Atribuindo o retorno do metodo a variavel.
		String name = p.getName();
		
		// erro, método é void
		//String a = p.setName("X");
		
		
		/* varargs possibilitam que um metodo receba um numero variavel de parametros
		   varargs deve ser sempre o ultimo da assinatura do metodo para evitar ambiguidade
		  
		 */
		Calculator c = cmeo.new Calculator();
		
		System.out.println(c.sum());
		System.out.println(c.sum(1));
		System.out.println(c.sum(1,2));
		System.out.println(c.sum(1,2,3,4,5,6,7,8,9));
		
		
		/*			EXERC
		  1 - b
		  2 - C
		  3 - B  // ERRO e
		  	Podemos também passar um array de ints para um método que recebe um varargs.
		  	Mas nunca podemos chamar um método que recebe array como se ele fosse varargs
		  	
		  4 - B  // ERRO e
		  	varargs aceita array de object
		 */
		
	}
	
	
	class Calculator{
		public int sum(int... nums){
			int total = 0;
			for (int a : nums)
				total+= a;
			
			return total;
		}
	}
	
	class Person{
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	//   ---------------------------------------------------------------------------------------------
	
	/*
	 	Podemos chamar outro metodo no mesmo objeto atraves da invocacao direta ao nome do metodo
	 */
	class A {
		void method1() {
			method2();
		}
			void method2() {}
	}
	
	
	
	
}
