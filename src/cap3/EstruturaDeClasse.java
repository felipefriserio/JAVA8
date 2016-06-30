//0 or 1 package
package cap3;

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
	//no package => package "default"
	  class Person{
		  
	  }
	  
	  //COMENTARIOS
	  //single line comment
	  /*
	   multiple line
	   comment
	  */
	  class /*middle of line comment*/ Person2{
		     /**
		     *  JavaDoc, starts with slash, then two *
		     *  and it is multiple line
		     */
		    public void method() { // single line comment again
		    } 
	   }
	  
	  
	  //CLASSE
	  /* classe eh a forma no Java onde definimos os atributos 
	   * e comportamentos de um objeto*/
	  class Person3{}
	  
	  /*Dentro de uma classe, podemos ter variaveis, metodos e construtores. 
	  Essas estruturas sao chamadas de membros da classe:*/
	  class Person4{ 
		  String firstname;
	      String lastname;
	    
	      Person4(String firstname, String lastname) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	      }
	      public String getFullName() {
	          return this.firstname + this.lastname;
	      } 
	  }
	  
	 
}
