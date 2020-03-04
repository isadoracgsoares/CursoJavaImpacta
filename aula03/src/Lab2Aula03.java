import java.util.Scanner;

public class Lab2Aula03 {
	
public static void main(String[] args) {
		
		System.out.println("*** Teste de Paridade ***");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número desejado:");
		int numero = scan.nextInt();
		
		String paridade = (numero % 2 == 0) ? "Par" : "Ímpar";

		System.out.printf("O número %d é %s \n",numero,paridade);
		
		scan.close();
	}

}
