package cap0;

public class VarArgsEArray {
	
	
	public static void main(String[] args) {
		
		demoVarArgs(new int[]{1,2,3}); // array de inteiro
		demoVarArgs(1,2,3);            // varargs
		
		
		
		demoArray(new int[]{1,2,3}); // array de inteiro
		//demoArray(1,2,3);          // nao compila, nao aceita varargs
	}
	
	// recebe tanto quanto varargs quanto um array de inteiro/ Object
	static void demoVarArgs (int ... numeros ){
		System.out.println("passou");
	}
	
	// recebe somente array de inteiros
	static void demoArray (int[] numeros ){
		System.out.println("passou");
	}
}
