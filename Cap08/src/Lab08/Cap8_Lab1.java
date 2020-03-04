package Lab08;
public class Cap8_Lab1 {
 
	
	public static void main(String[] args) {
		int numeros[] = {-1,-2,-28,-31,-10,-20,-30};
		int maior = maiorNumero(numeros);
		int menor = menorNumero(numeros); 
				
		exibeElementos(numeros);
		System.out.printf("\n\nO maior número da coleção é o %d \n", maior);
		System.out.printf("O menor número da coleção é o %d \n", menor);
		
	}
	
	private static int menorNumero(int[] numeros) {
		int menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}


	private static int maiorNumero(int[] numeros) {
		int maior = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	//Método extra auxiliar
	private static void exibeElementos(int[] numeros) {
		System.out.println("--Coleção--");
		for (int n : numeros) {
			System.out.printf("%d ",n);
		}
	}
}
