import java.util.Scanner;

public class VerificadorDePrimos {
	
	public static void main(String[] args) {
		System.out.println("---VERIFICADOR DE PRIMOS---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número desejado:");
		int numero = scan.nextInt();

		int divisores = 0;
		for(int divisor=1; divisor<=numero; divisor++) {
			if(numero % divisor == 0) {
				divisores++;
			}
		}
		String parentesco = (divisores > 2) ? "não é primo." : "é primo";
		System.out.printf("%d %s \n",numero,parentesco);
		
		scan.close();
	}

}
