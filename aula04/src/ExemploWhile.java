/*
 * 1. WHILE
 * 
 * 		while(condi��o){
 * 			[codigo: repete enquanto condi��o for true]
 * 		}
 * 
 * 
 * 2.DO-WHILE
 * 
 * 		do{
 * 			[codigo: repete enquanto condi��o for true]
 * 		}while(condi��o); 
 * 
 */

public class ExemploWhile {
	
	public static void main(String[] args) {
		
		System.out.println("-------WHILE)--------");
		int i = 10;
		while(i > 0) {
			System.out.printf("i: %d \n", i);
			i--;
		}
		System.out.println();
		System.out.println("-------DO WHILE)--------");
		
		int j = 10;
		do{
			System.out.printf("j: %d \n", j);
			j--;
		}while (j > 0);
		
		
		
	}

}
