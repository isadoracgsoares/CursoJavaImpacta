import java.util.Scanner;

public class Lab2Aula03 {
	
public static void main(String[] args) {
		
		System.out.println("*** Teste de Paridade ***");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero desejado:");
		int numero = scan.nextInt();
		
		String paridade = (numero % 2 == 0) ? "Par" : "�mpar";

		System.out.printf("O n�mero %d � %s \n",numero,paridade);
		
		scan.close();
	}

}
