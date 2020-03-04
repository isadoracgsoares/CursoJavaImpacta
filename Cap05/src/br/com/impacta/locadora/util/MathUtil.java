package br.com.impacta.locadora.util;

public class MathUtil {
	
	//Sera criada uma função ou método pra conversar com o arquivo CalculoFatorialConsole
	
	public double fatorial(int numero) {
		double fatorial = 1;
		for(int i=numero; i > 0; i--) {
			fatorial *= i;
		}
		
		return fatorial;
	}

	
	//Metodo numero primo
	
	public boolean verificaPrimo(int numero) {
		int divisores = 0;
		for(int divisor= 1; divisor<=numero; divisor++) {
			if(numero % divisor == 0) {
				divisores++;						
			}			
		}
		
		boolean resultado = (divisores == 2)? true : false;
		
		return resultado;
	}
	
	//Metodo Adição
	
		public int adicao(int num1, int num2) {
			return num1 + num2;
	}		
		
}
