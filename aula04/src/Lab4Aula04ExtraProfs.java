import java.util.Scanner;

public class Lab4Aula04ExtraProfs {
	
	public static void main(String[] args) {
		
		System.out.println("FATORIAL DE UM NUMERO");
		System.out.println();
		
		System.out.println("Digite um numero:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		//Tratar exceções
		if(numero < 0) {
			System.out.println("Não existe fatorial numero negativo");
			System.exit(0);
			
		}
		
		if(numero == 0) {
			System.out.printf("Fatorial de %d é %d \n", numero, 1);
			System.exit(0);
		}
		
		//calcular o fatorial do numero
		double fatorial = 1;
		for(int i=numero; i > 0; i--) {
			fatorial *=i;
		}
		
		//exibir o resultado
		System.out.printf("Fatorial de %d é %.0f \n", numero, fatorial);
		
		
	}

}
