
public class ExemploThread {
	
	public static void main(String[] args) {
		
		System.out.println("Inicio main \n");
		
		metodo1();
		System.out.println("Fim metodo 1 \n");
		
		metodo2();
				
		metodo3();
		System.out.println("Fim metodo 3 \n");
		
		System.out.println("Fim main.");
	}

	private static void metodo3() {
		System.out.println("Executando metodo 3");
		
	}

	private static void metodo2() {
		System.out.println("Executando metodo 2... \n");
		Thread t1 = new Thread(new MeuProcesso());
		t1.start(); //dispara a execução da thread
	}

	private static void metodo1() {
		System.out.println("Executando metodo 1");
		
	}

}
