import java.util.Scanner; //importa a classe da biblioteca util

public class Lab1Aula03Dinamico {
	
public static void main(String[] args) {
		
		System.out.println("*** SOMADOR DE DOIS NUMEROS ***");
		int valor1, valor2, resultado;		
		
		//inicia scan apontando o input para o console
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro número:");
		valor1 = scan.nextInt(); //aguarda digitar um inteiro
		
		System.out.println("Digite o segundo número:");
		valor2 = scan.nextInt(); //aguarda digitar um inteiro
		
		resultado = valor1 + valor2;
		
		System.out.printf("%d + %d = %d \n",valor1,valor2,resultado);
		
		scan.close();//fechando o scan
	}

}
