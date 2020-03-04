
public class ExemploInteiros {
	
	public static void main(String[] args) {
		
		//declaração + inicialização
		int idade = 15; 
		
		//exibindo o valor da variável na saída padrão unindo println
		System.out.println("Print 1 Idade = " + idade + " anos.");
		
		//somente declaração dá erro não funciona.
		int idade2; 
		
		//antes de utilizar a variável é obrigatório inicializá-la
		idade2 = 10;
		System.out.println("Print 2 Idade = " + idade2 + " anos.");
		
		//outros tipos inteiros
		byte a1 = 100; //1 byte
		short a2 = 200; //2 bytes
		int a3 = 300; //4 bytes
		long a4 = 400; //8 bytes
		
		System.out.println("Print 3 soma a1+a2+a3+a4 = " + (a1+a2+a3+a4)+ ".");
		
		System.out.printf("Print 4 Idade é de %d anos.", idade2); //o %d representa o idade2 sem concatenar
		
				
		//printf não pula linha nesse caso colocar o caracter de escape usando o \n
		System.out.printf("Idade é de %d anos. \n", idade2);
		System.out.printf("Idade é de %d anos. \n", a1);
		System.out.printf("Idade é de %d anos. \n", a2);
		System.out.printf("Idade é de %d anos. \n", a3);
		System.out.printf("Idade é de %d anos. \n", a4);
		
		
		
		
	}

}
