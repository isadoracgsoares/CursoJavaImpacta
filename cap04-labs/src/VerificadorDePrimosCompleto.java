import java.util.Scanner;

public class VerificadorDePrimosCompleto {
	
	public static void main(String[] args) {
		System.out.println("---VERIFICADOR DE PRIMOS---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero desejado:");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("N�o existe primo de numero negativo!");
			System.exit(0); //saindo do programa
		}
		
		if((numero == 0) || (numero == 1)) {
			System.out.printf("%d n�o � primo!",numero);
			System.exit(0); //saindo do programa
		}
		
		int divisores = 2;
		for(int divisor=2; divisor<(numero/2+1); divisor++) {
			if(numero % divisor == 0) {
				divisores++;
				if(divisores > 2) {
					break;
				}
			}
		}
		
		String parentesco = (divisores > 2) ? "n�o � primo." : "� primo";
		System.out.printf("%d %s \n",numero,parentesco);
		
		
		scan.close();
	}

}
