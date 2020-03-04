package cap06;

public class ExemploRecursivo {
	private static int contador;
	
	public static void main(String[] args) {
		recursivo();		
	}	
	private static void recursivo() {
		System.out.println("chamada: "+ (++contador));		
		if (contador == 10) {
			return; //desempilha
		}
		recursivo();
	}
}
