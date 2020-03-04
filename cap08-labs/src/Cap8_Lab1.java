public class Cap8_Lab1 {
	
	public static void main(String[] args) {
		int[] numeros = {-34,-56,45,77,13,88,16,-9,1,-1,-5678,45,345,200,213,101,201};
		
		int maiorNumero = maiorNumero(numeros);
		System.out.printf("O maior número da coleção é o %d \n",maiorNumero);
	}
	
	private static int maiorNumero(int[] numeros) {
		
		if(numeros == null || numeros.length == 0) {
			System.out.println("Array vazio! Abortando...");
			System.exit(0);
		}
		
		int maior = numeros[0]; 
		
		for(int numero : numeros) {
			if(numero > maior) {
				maior = numero;
			}
		}
		return maior;
	}
}
