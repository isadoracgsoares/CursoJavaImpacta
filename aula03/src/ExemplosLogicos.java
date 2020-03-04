/*
 * Operadores relacionais ou comparativos
 * Igualdade: ==
 * Diferença: !=
 * Maior que: >
 * Menor que: <
 * Maior ou igual a: >=
 * Menor ou igual a: <=
 * 
 * Operadores logicos
 * AND : & ou &&
 * OR  : | ou ||
 * NOT : !
 * XOR : ^
 *  
 */
public class ExemplosLogicos {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean resultado;
		
		//Operadores relacionais ou comparativos
		System.out.println("RELACIONAIS OU COMPARATIVOS");
		
		System.out.println();
		
		resultado = (a == b); //parenteses opcional
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		resultado = (a != b); 
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		resultado = (a > b); 
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		resultado = (a < b);
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		resultado = (a >= b);
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		resultado = (a <= b);
		System.out.printf("%d é a igual %d? = %b \n", a, b, resultado);
		
		System.out.println();
		
		System.out.println("--------------------------");
		
		System.out.println();
		
		//Operadores Logicos		
		System.out.println("LOGICOS");
		
		System.out.println();
		
		//OR: se uma das expressoes for true o resultado é true
		resultado = (a > 5) || (b<18);
		System.out.printf("%d>5 ou %d<18? = %b \n", a,b, resultado);
		
		//AND: se uma das expressoes for false o resultado é false
		resultado = (a > 5) & (b<18);
		System.out.printf("%d>5 e %d<18? = %b \n", a,b, resultado);
		
		//XOR (ou exclusivo): treu somente se os resultados forem diferentes entre si
		resultado = (a > 5) ^ (b<18);
		System.out.printf("Ou %d>5 ou %d<18? = %b \n", a,b, resultado);
		
		//NOT Inverte o resultado da expressao
		resultado = !(a > 5);
		System.out.printf("Não -> %d>5 = %b \n", a,resultado);
				
		
		
		
		
		
	}

}
