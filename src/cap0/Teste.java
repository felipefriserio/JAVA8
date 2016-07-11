package cap0;

import java.io.File;
import java.util.*;


class Atencao{
	
	 /*ATENCAO*/
	 // Multiplas estruturaas em um unico arquivo
	 /* Eh possivel definir mais de uma classe interface em um mesmo arquivo java. Regras:
	  * 
	  * -Podemserde nidosemqualquerordem;
		• Se existir alguma classe/interface pu�?blica, o nome do arquivo deve ser o mesmo dessa classe/interface;
		• So pode existir uma classe/interface pu�?blica por arquivo;
		• Se não houver nenhuma classe/interface pu�?blica, o arquivo pode ter qualquer nome.
	  * */
	  
	  // Regras de imports e pacotes 
	 /* Caso exista a de nição de um pacote, ela vale para todas as classes/interfaces de nidas nesse arquivo, 
	  e o mesmo vale para imports.
	  	SEMPRE respeitar a ordem
	  	PACKAGE 
	  	IMPORT
	  * class
	  */
}
public class Teste {
	
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
	}

}
