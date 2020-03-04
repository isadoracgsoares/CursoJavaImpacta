package Lab1Cap11;

import java.time.Year;
import java.util.Scanner;

public class ExercicioIdade {
	
	public static void main(String[] args) {
		
	try {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o ano do seu nascimento: ");
		String anoNasc = scan.nextLine();
		
		int ano = Integer.parseInt(anoNasc);
		int idade = Year.now().getValue() - ano;
		
		System.out.println("Você possui " + idade + " anos de idade");
		
		}catch(NumberFormatException e) {
			System.out.println("Valor digitado invalido!");
		}			
	}
}