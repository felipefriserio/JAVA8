package cap4TrabalhandoComTiposDeDados;

public class LerEscreverCamposDeObjetos {
	static class B{
		 int c;
		 void c(int c) {
		 c = c;
	 }
	}
	
	
	public static void main(String[] args) {
	 B b = new B();
	 b.c = 10;
	 System.out.println(b.c);
	 b.c(30);
	 System.out.println(b.c);
	}
	
}
