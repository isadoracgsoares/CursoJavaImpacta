
public class ExemploSwitch2 {
	
	public static void main(String[] args) {
		
		char nota = 'C';
		
		switch(nota) {
		case 'A': case 'B': case 'C': case 'D':
			System.out.println("Aprovado!");
			break;
		default: //default � o �ltimo
			System.out.println("Reprovado!");
			
		}
	}

}
