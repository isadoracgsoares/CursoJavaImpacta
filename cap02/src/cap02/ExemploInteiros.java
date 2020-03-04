package cap02;

public class ExemploInteiros {
	
	public static void main(String[] args) {
		
		int idade = 127; //declarando e inicializando 
		idade = 15; //alterando o valor original
		
		System.out.println("Idade de fulano é " + idade + " anos!");
		
		System.out.printf
		("Idade de fulano é %d anos! %d anos! \n", idade, idade);
		
		int idadeOctal = 0156;
		System.out.printf("Idade de fulano é %d anos!\n", idadeOctal);
		
		int idadeHexa = 0XA9;
		System.out.printf("Idade de fulano é %d anos!\n", idadeHexa);
		
		int idadeBin = 0B0111110111001;
		System.out.printf("Idade de fulano é %d anos!\n", idadeBin);
		
		int a,b,c,d,e = 30; //inicializando apenas o "e"
		
		//literal long acima da capacidade do byte
		long i = 155; //100_000_000_000L;
		
		byte k = (byte) i; //long atribuido a um byte com casting
		System.out.println("K = " + k);//valor truncado inválido
		
		
		
		
		
		
	}

}
