package cap14;

public class UsaCalculadora {
	
	public static void main(String[] args) {
		
		Soma soma = new Soma();
		double resultado = Calculadora.calcular(soma, 40, 20);
		System.out.printf("Soma de %d e %d é %.2f \n", 40, 20, resultado);
	
	
		Subtracao subtracao = new Subtracao();
		resultado = Calculadora.calcular(subtracao,  40, 20);
		System.out.printf("Subtração de %d e %d é %.2f \n", 40, 20, resultado);
		
		//Multiplicacao multiplicacao = new Multiplicacao();
		resultado = Calculadora.calcular((x,y) -> x*y,  40, 20);
		System.out.printf("Multiplicação de %d e %d é %.2f \n", 40, 20, resultado);
		
		//Divisao divisao = new Divisao();
		resultado = Calculadora.calcular((x,y) -> x/y,  40, 20);
		System.out.printf("Divisão de %d e %d é %.2f \n", 40, 20, resultado);
		
		Operacao potencia = (x,y) -> Math.pow(x,y);
		resultado = Calculadora.calcular(potencia, 40, 2);
		System.out.printf("Potencia de %d e %d é %.2f \n", 40, 2, resultado);		

	}
}