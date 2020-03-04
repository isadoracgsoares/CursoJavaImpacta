package cap06;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		double fat = fatorial(numero);
		System.out.printf("O fatorial de %d é %.0f ",numero,fat);
	}

	private static double fatorial(int numero) {
		if(numero == 1) {
			return 1;
		}
		
		return numero * fatorial(numero-1);
	}
	
	
	
}
