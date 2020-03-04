package cap02;

public class ExemploChar {
	
	public static void main(String[] args) {
		
		char ch1 = 75; //indice unicode base 10
		char ch2 = '\u0003'; //indice unicode base 16
		char ch3 = 'A'; //literal caracter direto
		
		System.out.printf("char idx 75 : %s \n",ch1);
		System.out.printf("char idx u0003 : %s \n",ch2);
		System.out.printf("char 'A' : %s \n",ch3);
		
		int soma = ch1 + ch3; //contexto numerico usa o indice
		System.out.println("Resultado: " + soma);
		
		//contexto textual usa o caracter correspondente
		System.out.println("Texto " + ch1 + ch3);
		
		
		
	}

}
