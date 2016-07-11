//0 or 1 package
package cap3OBasicoDeJava;

//0 or more imports
import java.util.Date;

//0 or more types
public class EstruturaDeClasse {

	//PACOTES
	/* - Serve para separar e organizar classes
	 * - Caso o pacote nao seja declarado ele fara parte do default package.
	 * 	 Todas as classes no default package se enxergam e podem ser utilizadas entre si.
	 *   Classes do default package nao podem ser importadas para uso em outros pacotes. 
	 * 
	 * */
	//nopackage=>package"default"
	  class Person{
		  
	  }
	  
	  //COMENTARIOS
	  //single line comment
	  /*
	   multiple line
	   comment
	  */
	  class /*middleoflinecomment*/ Person2{
		     /**
		     *  JavaDoc, starts with slash, then two *
		     *  and it is multiple line
		     */
		    public void method() { // single line comment again
		    } 
	   }
	  
	  
	  //CLASSE
	  /* classe é a forma no Java onde de nimos os atributos 
	   * e comportamentos de um objeto*/
	  class Person3{}
	  
	  /*Dentro de uma classe, podemos ter variáveis, métodos e construtores. 
	  Essas estruturas são chamadas de membros da classe:*/
	  class Person4{ 
		  String firstname; // variavel de instancia - existe uma copia dela para cada instancia
	      String lastname;  // variavel de instancia - existe uma copia dela para cada instancia
	    
	      //construtor
	      Person4(String firstname, String lastname) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	      }
	      
	      //metodo
	      public String getFullName() {
	          return this.firstname + this.lastname;
	      } 
	  }
	  
	  // Variaveis 
	  /*Tipo seguido pelo Nome*/
	  
	  // Metodos
	  /*Tipo do retorno seguido pelo nome do metodo*/
	 
	  // Construtores
	  /* Uma classe pode cnstruir zero ou varios construtores
	   * - Construtor nao tem retorno e tem o mesmo nome da Classe
	   * */
	  
	  
	  
	  // Interface
	  /*Em uma interface, devemos apenas de nir a assinatura do método, sem a sua implementação. 
	  Além da assinatura de métodos, também é possível declarar constantes em interfaces*/
	  
	 /*ATENCAO*/
	 // Multiplas estruturaas em um unico arquivo
	 /* Eh possivel definir mais de uma classe interface em um mesmo arquivo java. Regras:
	  * 
	  * -Podemserde nidosemqualquerordem;
		• Se existir alguma classe/interface pública, o nome do arquivo deve ser o mesmo dessa classe/interface;
		• So pode existir uma classe/interface pública por arquivo;
		• Se não houver nenhuma classe/interface pública, o arquivo pode ter qualquer nome.
	  * */
	  
	  // Regras de imports e pacotes 
	 /* Caso exista a de nição de um pacote, ela vale para todas as classes/interfaces de nidas nesse arquivo, 
	  e o mesmo vale para imports.*/
	  
	  
	  // Importar 
	  
	  /*
	   * Full Qualified Name  = FQN
	   * 
	   * Exemplo fqn: java.sql.Date
	   * 
	   * */
	  
	  
	  	/* - importar todas as classes de um pacote
	  	 * import java.util.*;
	  	 * 
	  	 * */
	  
	  
	 /* 
	  * - Caso existam 2 classes com o mesmo nome, mas de pacotes diferentes, só podemos importar uma delas.
	  * A outra deve ser referenciada pelo FQN
	  * 
	  * import java.util.*;
	  * */
	  class Foo{
		  Date some; // java.util.Date 
		  java.sql.Date other; // java.sql.Date
	  }
	    
	  
	  
	  
	  
	  
}
