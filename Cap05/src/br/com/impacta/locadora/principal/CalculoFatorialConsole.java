package br.com.impacta.locadora.principal;
import java.util.Scanner;

import br.com.impacta.locadora.util.MathUtil;

public class CalculoFatorialConsole {
	
	public static void main(String[] args) {
		
		System.out.println("------App do Cálculo do Fatorial------");
		System.out.println("Informe o número desejado: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//Aqui solicitar a execução do calculo ao objeto de outra classe
		MathUtil mu = new MathUtil(); //instanciação
		double resultado = mu.fatorial(num); //substituir pela chamada do metodo
		
		System.out.printf("O fatorial de %d é %.0f \n", num, resultado);
	}
}
