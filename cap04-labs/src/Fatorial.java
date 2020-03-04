import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		System.out.println("---CALCULO FATORIAL---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número desejado:");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("Não existe fatorial de numero negativo.");
			System.exit(0);
		}
		
		double fatorial = 1;
		
		if(numero == 1 || numero == 0) {
			System.out.printf("Fatorial de %d é %.0f \n",numero,fatorial);
			System.exit(0);
		}
		
		for(int i=numero; i>1; i--) {
			fatorial *= i;
		}
		
		System.out.printf("Fatorial de %d é %.0f \n",numero,fatorial);
		scan.close();
	}

}
