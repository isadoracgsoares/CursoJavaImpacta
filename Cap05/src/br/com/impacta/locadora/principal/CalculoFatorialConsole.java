package br.com.impacta.locadora.principal;
import java.util.Scanner;

import br.com.impacta.locadora.util.MathUtil;

public class CalculoFatorialConsole {
	
	public static void main(String[] args) {
		
		System.out.println("------App do C�lculo do Fatorial------");
		System.out.println("Informe o n�mero desejado: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//Aqui solicitar a execu��o do calculo ao objeto de outra classe
		MathUtil mu = new MathUtil(); //instancia��o
		double resultado = mu.fatorial(num); //substituir pela chamada do metodo
		
		System.out.printf("O fatorial de %d � %.0f \n", num, resultado);
	}
}
