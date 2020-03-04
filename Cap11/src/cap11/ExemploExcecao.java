package cap11;

public class ExemploExcecao {
	
	public static void main(String[] args) {
		
		System.out.println("iniciando programa... \n");
		
		try {		
			
			int valor1 = Integer.parseInt(args[0]);
			int valor2 = Integer.parseInt(args[1]);
			
			double resultado = dividir(valor1,valor2);
			System.out.printf("Resultado da divisão é: %.2f \n\n", resultado);
			
		}catch(ArithmeticException e){
			System.out.println("Divisão por zero não existe! \n");		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Informe ao menos 2 parametros!");
		}catch(NumberFormatException e) {
			System.out.println("Favor digitar apenas números inteiros!");
		}finally {
			System.out.println("Sempre executa!\n");
		}
		
		System.out.println("finalizando o programa");		
		
	}

	private static double dividir(int num1, int num2) {

		double r = num1/num2;
		
		return r;
		
	}

}
