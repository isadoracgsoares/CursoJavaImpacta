package cap03;

public class ExemploOperadoresRelacionais {
	
	public static void main(String[] args) {
		
		/*
		 *  == : igualdade
		 *  != : diferença
		 *  >,>= : maior que, maior ou igual que
		 *  <,<= : menor que, menor ou igual que
		 *  
		 *  A aplicação desse tipo de operador sempre
		 *  retorna um valor booleano (true/false)
		 * 
		 */
		int a = 20, b = 30;
		boolean resultado;
		
		resultado = ( a == b );
		System.out.printf("%d é igual a %d ? %b \n",a,b,resultado);
		
		resultado = ( a != b );
		System.out.printf("%d é diferente de %d ? %b \n",a,b,resultado);
		
		resultado = ( a > b );
		System.out.printf("%d é maior que %d ? %b \n",a,b,resultado);

		//etc	
		
		//Operadores lógicos concatenam expressões comparativas
		/*
		 *  & / && : AND / AND curto-circuito
		 *  | / || : OR  / OR curto-circuito
		 *  ^ : XOR (OR Exclusivo)
		 *  ! : NOT (negação)
		 */
		resultado = ( (a >= 20) && (b < 30));
		System.out.printf("%d >= 20 E %d < 30 ?? %b \n",a,b,resultado);
		
		resultado = ( (a >= 20) || (b < 30));
		System.out.printf("%d >= 20 OU %d < 30 ?? %b \n",a,b,resultado);
		
		resultado = ( (a >= 20) ^ (b < 30));
		System.out.printf("%d >= 20 OU-EXCLUSIVO %d < 30 ?? %b \n",a,b,resultado);

		resultado = !(b < 30);
		System.out.printf("NÃO %d < 30 ?? %b \n",b,resultado);
		
		
		
	}

}
