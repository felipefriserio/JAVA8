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
