
public class ExemploString {
	
	public static void main(String[] args) {
		
		String s1 = "Curso Java Programmer"; //s1 objeto da classe String

		System.out.printf("s1 = %s \n", s1);
		
		//caracteres de escape: nova linha
		String s2 = "Linha1\nLinha2\nLinha3\n";
		System.out.printf("%s", s2);
		
		//Caracter de escape da linguagem é o barra(\)
		String s3 = "palavra \"entre aspas\" escrita! \n";
		System.out.printf("%s", s3);
		
		String s4 = "Texto \\entre barras\\ exibido! \n";
		System.out.printf("%s", s4);
		
		//Degustação: Exibindo o texto em caixa alta
		System.out.printf("%s", s4.toUpperCase());
		
	}

}
