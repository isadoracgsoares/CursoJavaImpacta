/*
 * 
 * Operadores Aritmeticos
 * 
 * Adi��o: +
 * Subtra��o: -
 * Multiplica��o: *
 * Divis�o (div): /
 * Resto Divis�o (mod): %
 * 
 * 
 */
public class ExemploAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 3;
		int resultado;
		
		resultado = a + b ;
		System.out.printf(" %d + %d = %d \n", a, b, resultado);
		
		resultado = a - b;
		System.out.printf(" %d - %d = %d \n", a, b, resultado);
		
		resultado = a * b;
		System.out.printf(" %d x %d = %d \n", a, b, resultado);
		
		resultado = a / b;
		System.out.printf(" %d / %d = %d \n", a, b, resultado); //vai dar apenas o numero inteiro do dividendo por ser int
				
		resultado = a / b;
		System.out.printf(" %d div %d = %d \n", a, b, resultado);
		
		resultado = a % b;
		System.out.printf(" %d mod %d = %d \n", a, b, resultado);
		
		System.out.println();
		
		//Atribui��o com operador (acumulativo) - exemplo
		a += 75; // isso � igual -> a = a + 75;
		System.out.printf("O valor de 'a' mudou para %d \n", a);
		
		System.out.println();
		
		//Incremento e decremento em 1 unidade o valor da vari�vel
		System.out.printf("Valor de b � %d \n", b);
		b++; //b = b + 1;
		System.out.printf("Valor de b (depois do incrmento) � %d \n", b);
		b--; //b = b - 1;
		System.out.printf("Valor de b (depois do decremento) � %d \n", b);
		
		System.out.println();
		
		System.out.printf("(Exemplo pr�-fixado) Valor de b � %d \n", b);
		++b; //b = b + 1;
		System.out.printf("Valor de b (depois do incrmento) � %d \n", b);
		--b; //b = b - 1;
		System.out.printf("Valor de b (depois do decremento) � %d \n", b);
		
		System.out.println();
		
		//Diferen�a na atribui��o pr�-fixada e p�s-fixada
		int i = 5;
		int j = i++; //pos-fixado tem menor precedente que a atribui��o
		System.out.printf(" i = %d  j = %d \n", i,j);
		
		int k = 5;
		int w = ++k; //pre-fixado em maior precedencia que a atribui��o
		System.out.printf(" k = %d  w = %d \n", k,w);
		
		
		
		
	}

}
