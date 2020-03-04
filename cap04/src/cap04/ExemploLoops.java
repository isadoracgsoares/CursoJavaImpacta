package cap04;

public class ExemploLoops {
	
	public static void main(String[] args) {
		
		int i = 0; //variavel de controle

		System.out.println("---USANDO while---");
		while(i < 10) {
			System.out.printf("i: %d \n",i);
			i++;
		}
		
		int j = 0; //variavel de controle
		System.out.println("---USANDO do-while---");
		do {
			System.out.printf("j: %d \n",j);
			j++;
		}while(j < 10);
		
		System.out.println("---USANDO for---");		
		for(int k=0; k<10; k++) {
			System.out.printf("k: %d \n",k);
		}
		
		System.out.println("---USANDO foreach---");
		int[] numeros = {10,20,30,40,50};
		for(int num : numeros) {
			System.out.println(num);
		}
		
		//Exemplo de quebra de loop
		System.out.println("---USANDO break---");
		//Encerra quando encontrar um multiplo de 3
		for(int k=1; k<91; k++) {
			if(k % 3 == 0) {
				break; //sai do loop
			}
			System.out.printf("k: %d \n",k);
		}
		
		//Exemplo de quebra de laço corrente
		System.out.println("---USANDO continue---");
		//Não imprime os multiplos de 3
		for(int k=1; k<91; k++) {
			if(k % 3 == 0) {
				continue; //encerra somente o laço corrente
			}
			System.out.printf("k: %d \n",k);
		}

	
		
		
		
		//Loops aninhados
		soma15:
		for(int a=0; a<10; a++) {
			for(int b=10; b>0; b--) {
				if((a + b) == 15) {
					break soma15;
				}
				System.out.printf("(a,b): %d,%d \n",a,b);
			}
		}
		
	} 

}
