/*
 * 	- Usado normalmente para valores delimitados (dominio fechado)
 * 	- Testa apenas valor associado a uma variável
 * 	Valido para: byte, short, int, char, enum, String
 *  
 */
public class ExemploSwitch1 {
	
	public static void main(String[] args) {
		
		char nota = 'C';
		
		switch(nota) {
		case 'A':
			System.out.println("Excelente!");
			break;
		case 'B':
			System.out.println("Ótimo!");
			break;
		case 'C':
			System.out.println("Bom!");
			break;
		case 'D':
			System.out.println("Regular!");
			break;
		default: //default é o último
			System.out.println("Reprovado!");
			
		}
	}

}
