package cap06;

public class UsaExemploSobrecarga {
	
	public static void main(String[] args) {
		ExemploSobrecarga es = new ExemploSobrecarga();
		
		es.imprimir(10);
		es.imprimir("texto");
		es.imprimir(10, "texto");
		es.imprimir("texto", 10);		
	}
}
