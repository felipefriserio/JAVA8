package cap4TrabalhandoComTiposDeDados;

public class CicloDeVidaObjeto {

	public static void main(String[] args) {
		CicloDeVidaObjeto c = new CicloDeVidaObjeto();
		/*-------------------------------- Criacao de objetos --------------------------------*/
		// Apenas declarando a variavel,
		// nenhum objeto foi criado aqui
		Person p;
		
		// Agora um objeto foi criado e atribuido a variavel
		p = c.new Person();
		
		/*-------------------------------- Objeto Acessivel --------------------------------*/
		Person pe = c.new Person(); // criacao
		pe.name = "aaa";
		
	}
	
	class Person{
		String name;
	}
	
	
	
	/*			4.4
	 1-b  ERRO C
	 2-b
	 3-a  ERRO B 
	
	*/
	
}
