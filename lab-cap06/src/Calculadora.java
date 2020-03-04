public class Calculadora {

	public int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}
	
	public int subtrair(int valor1, int valor2) {
		System.out.println("subtrair(int,int)");
		int resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(int valor1, double valor2) {
		System.out.println("subtrair(int,double)");
		double resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(double valor1, int valor2) {
		System.out.println("subtrair(double,int)");
		double resultado = valor1 - valor2;
		return resultado;		
	}
	
	public double subtrair(double valor1, double valor2) {
		System.out.println("subtrair(double,double)");
		double resultado = valor1 - valor2;
		return resultado;
	}
	
	public int multiplicar(int valor1, int valor2) {
		int resultado = valor1 * valor2;
		return resultado;
	}
	
	public int dividir(int valor1, int valor2) {
		int resultado = valor1 / valor2;
		return resultado;
	}


	

}
