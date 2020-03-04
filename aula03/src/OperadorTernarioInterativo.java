import java.util.Scanner;

public class OperadorTernarioInterativo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Digite a idade desejada:");
		Scanner scan = new Scanner(System.in); //associa o teclado
		
		int idade = scan.nextInt();
		String maioridade;
		
		maioridade = (idade >= 18)? "Maior" : "Menor";
		
		System.out.printf("Idade igual a %d anos é considerado %s que 18 anos.", idade, maioridade);
		
		
	}
}
