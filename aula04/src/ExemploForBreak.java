
public class ExemploForBreak {
	
	public static void main(String[] args) {
		
		System.out.println("----Exemplo de break-----");
		for(int i=500; i>0; i--) {
			System.out.printf("i : %d \n", i);
			if(1 % 7 == 0) { //procura multiplo de 7
				break; //sai do for
			}
			
		}
		
		System.out.println("----Exemplo de continue-----");
		for(int i=500; i>0; i--) {
			System.out.printf("i : %d \n", i);
			if(1 % 7 == 0) { //procura multiplo de 7
				continue; //sai da execução corrente e continua no for
			}
			System.out.printf("i : %d \n", i);
	}

}
}
