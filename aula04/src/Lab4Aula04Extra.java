import java.util.Scanner;

public class Lab4Aula04Extra {
	
	public static void main(String[] args) {
		
		System.out.println("FATORIAL DE UM NUMERO");
		System.out.println();
		
		System.out.println("Digite um numero:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int a = (numero -1);
		int b = (a -1);
		int c = (b -1);
		String resultado;
		
		if(numero < 0) {
			System.out.println("Não pode ser numero negativo");
			System.exit(0);
			
		}
		
		if(numero == 0) {
			System.out.println("Fatorial é 1");
			System.exit(0);
		}
		
		System.out.printf("Fatorial de %d! = %dx%dx%d \n", numero,a,b,c);
		
		
	}

}
