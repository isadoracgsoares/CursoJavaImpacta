package br.com.impacta.locadora.principal;
import java.util.Scanner;

import br.com.impacta.locadora.util.MathUtil;

public class CalculoPrimo {
	
	public static void main(String[] args) {
		
		System.out.println("------VERIFICADOR DE PRIMO------");
		System.out.println("Digite o número: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		MathUtil mu = new MathUtil();
		boolean ehPrimo = mu.verificaPrimo(num); //chamar método
		
		String msg = (ehPrimo)? "PRIMO" : "NÃO PRIMO";
		
		System.out.printf("O numero %d é %s \n", num, msg);
		
		
	}

}
