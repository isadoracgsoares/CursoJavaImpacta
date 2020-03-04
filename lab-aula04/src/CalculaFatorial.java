import java.util.Scanner;

public class CalculaFatorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero = scan.nextInt();
		
		//tratar exce��es
		if(numero < 0 ) {
			System.out.println("N�o existe fatorial de numero negativo");
			System.exit(0);
		}
		
		if(numero == 0) {
			System.out.printf("Fatorial de %d � %d \n",numero,1);
			System.exit(0);
		}
		
		//calcular o fatorial do numero
		double fatorial = 1;
		for(int i=numero; i > 0; i--) {
			fatorial *= i;
		}
		
		//exibir o resultado
		System.out.printf("Fatorial de %d � %.0f \n",numero,fatorial);
		
	}

}
