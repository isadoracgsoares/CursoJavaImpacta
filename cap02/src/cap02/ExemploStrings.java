package cap02;

public class ExemploStrings {
	
	public static void main(String[] args) {
		
		//Compilador cria um objeto implicitamente
		String s1 = "Um Texto";
		
		System.out.printf("Texto: %s \n",s1);
		System.out.printf("Texto: %s \n",s1.toUpperCase());
		System.out.printf("Texto: %s \n",s1.toLowerCase());
		
		//Dev cria um objeto String explicitamente
		String s2 = new String("Outro Texto"); 
		
		//caracter de escape: exemplos
		System.out.println(" Linha1\n Linha2\n Linha3");
		
		System.out.println("Texto \"entre aspas\" exibido");
		
		System.out.println("Texto \\entre barras\\ exibido");
		
		
	}

}
