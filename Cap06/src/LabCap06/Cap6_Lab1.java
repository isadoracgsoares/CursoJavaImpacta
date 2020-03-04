package LabCap06;
import java.util.Scanner;

public class Cap6_Lab1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---CALCULADORA BÁSICA---");
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		Calculadora calc = new Calculadora();
		
		int resultado = calc.somar(num1,num2);
		System.out.printf("calc.somar(%d,%d) = %d\n",num1,num2,resultado);
		
		resultado = calc.subtrair(num1, num2);
		System.out.printf("calc.subtrair(%d,%d) = %d\n",num1,num2,resultado);
		
		resultado = calc.multiplicar(num1, num2);
		System.out.printf("calc.multiplicar(%d,%d) = %d\n",num1,num2,resultado);
		
		resultado = calc.dividir(num1, num2);
		System.out.printf("calc.dividir(%d,%d) = %d\n",num1,num2,resultado);
		
		scan.close();
		
		
	}

}
