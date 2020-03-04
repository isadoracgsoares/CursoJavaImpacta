
public class ExemploInteiros {
	
	public static void main(String[] args) {
		
		//declara��o + inicializa��o
		int idade = 15; 
		
		//exibindo o valor da vari�vel na sa�da padr�o unindo println
		System.out.println("Print 1 Idade = " + idade + " anos.");
		
		//somente declara��o d� erro n�o funciona.
		int idade2; 
		
		//antes de utilizar a vari�vel � obrigat�rio inicializ�-la
		idade2 = 10;
		System.out.println("Print 2 Idade = " + idade2 + " anos.");
		
		//outros tipos inteiros
		byte a1 = 100; //1 byte
		short a2 = 200; //2 bytes
		int a3 = 300; //4 bytes
		long a4 = 400; //8 bytes
		
		System.out.println("Print 3 soma a1+a2+a3+a4 = " + (a1+a2+a3+a4)+ ".");
		
		System.out.printf("Print 4 Idade � de %d anos.", idade2); //o %d representa o idade2 sem concatenar
		
				
		//printf n�o pula linha nesse caso colocar o caracter de escape usando o \n
		System.out.printf("Idade � de %d anos. \n", idade2);
		System.out.printf("Idade � de %d anos. \n", a1);
		System.out.printf("Idade � de %d anos. \n", a2);
		System.out.printf("Idade � de %d anos. \n", a3);
		System.out.printf("Idade � de %d anos. \n", a4);
		
		
		
		
	}

}
