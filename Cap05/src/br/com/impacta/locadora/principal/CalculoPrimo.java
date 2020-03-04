package br.com.impacta.locadora.principal;
import java.util.Scanner;

import br.com.impacta.locadora.util.MathUtil;

public class CalculoPrimo {
	
	public static void main(String[] args) {
		
		System.out.println("------VERIFICADOR DE PRIMO------");
		System.out.println("Digite o n�mero: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		MathUtil mu = new MathUtil();
		boolean ehPrimo = mu.verificaPrimo(num); //chamar m�todo
		
		String msg = (ehPrimo)? "PRIMO" : "N�O PRIMO";
		
		System.out.printf("O numero %d � %s \n", num, msg);
		
		
	}

}
