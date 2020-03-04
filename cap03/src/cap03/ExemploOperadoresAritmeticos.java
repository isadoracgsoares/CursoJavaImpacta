package cap03;

public class ExemploOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		//Operador de atribuição (=)
		int a1 = 10; //atribui o valor 10 à variável a1
		
		/*
		 * Operadores aritmeticos
		 * + : Adição
		 * - : Subtração
		 * * : Multiplicação
		 * / : Divisão
		 * % : Resto da divisão (mod)
		 *  
		 */
		int val1 = 20, val2 = 10, resultado = 0;
		
		resultado = val1 + val2;
		System.out.printf(" %d + %d = %d \n",val1,val2,resultado);
		
		resultado = val1 - val2;
		System.out.printf(" %d - %d = %d \n",val1,val2,resultado);
		
		resultado = val1 * val2;
		System.out.printf(" %d * %d = %d \n",val1,val2,resultado);
		
		resultado = val1 / val2;
		System.out.printf(" %d / %d = %d \n",val1,val2,resultado);

		resultado = val1 % val2;
		System.out.printf(" %d %% %d = %d \n",val1,val2,resultado);

		//Atribuição reduzida com operação (qualquer operador aritmetico)
		resultado = 5;
		resultado += 30; //resultado = resultado + 30;
		//esperado 35
		System.out.println("Resultado = " + resultado);
		
		//autoincremento
		int valor1 = 10;
		System.out.println("valor1 (antes) = " + valor1);
		valor1++; // (valor1 += 1;) ou (valor1 = valor1 + 1;)
		System.out.println("valor1 (depois) = " + valor1);
		
		//autodecremento
		int valor2 = 10;
		System.out.println("valor2 (antes) = " + valor2);
		valor2--; // (valor2 -= 1;) ou (valor2 = valor2 - 1;)
		System.out.println("valor2 (depois) = " + valor2);
		
		//Autoincremento pre-fixado
		int i = 0;
		int j = 0;
		System.out.println("i (antes) = "+i);
		System.out.println("j (antes) = "+j);
		j = ++i; //pre-fixado
		System.out.println("i (depois-pre) = "+i);
		System.out.println("j (depois-pre) = "+j);
		
		//Autoincremento pos-fixado
		int k = 0;
		int w = 0;
		System.out.println("k (antes) = "+k);
		System.out.println("w (antes) = "+w);
		w = k++; //pos-fixado
		System.out.println("k (depois-pos) = "+k);
		System.out.println("w (depois-pos) = "+w);
				
		
	}

}
