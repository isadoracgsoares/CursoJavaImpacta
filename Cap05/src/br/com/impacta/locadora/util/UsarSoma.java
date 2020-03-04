package br.com.impacta.locadora.util;
import java.util.Scanner;


public class UsarSoma {
	
public static void main(String[] args) {
		
		System.out.println("------Verificando Soma------");

		int a = 10;
		int b = 20;

		MathUtil math = new MathUtil(); 
		int resultado = math.adicao(a, b); 
		System.out.printf("%d + %d = %d \n", a, b, resultado);
		
		resultado = math.adicao(3560, 13776);
		System.out.printf("%d + %d = %d \n", 3560, 13776, resultado);

	}
}




