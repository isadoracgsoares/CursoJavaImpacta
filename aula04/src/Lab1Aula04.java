import java.util.Scanner;

public class Lab1Aula04 {
	
	public static void main(String[] args) {
		
		System.out.println("---NUMERO PRIMO---");
		
		System.out.println("Digite o numero:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("N�o existe numero primo negativo");
			System.exit(0); //aborta a JVM
		}
		
		if(numero == 0 || numero == 1) {
			System.out.printf("O n�mero %d %s \n", numero, "N�o � Primo");
			System.exit(0); //aborta a JVM
		}
		//Contar numero de divisores de numero
		int numeroDeDivisores = 0;
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				numeroDeDivisores++;
			}
		}
		
		String msgPrimo = (numeroDeDivisores == 2) ? "Primo" : "N�o Primo";
		
		System.out.printf("O numero %d � %s \n", numero, msgPrimo);
		
		
		
	}

}
