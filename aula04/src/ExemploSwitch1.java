/*
 * 	- Usado normalmente para valores delimitados (dominio fechado)
 * 	- Testa apenas valor associado a uma vari�vel
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
			System.out.println("�timo!");
			break;
		case 'C':
			System.out.println("Bom!");
			break;
		case 'D':
			System.out.println("Regular!");
			break;
		default: //default � o �ltimo
			System.out.println("Reprovado!");
			
		}
	}

}
