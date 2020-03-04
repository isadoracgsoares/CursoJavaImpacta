package cap04;

public class ExemploSwitch {
	
	public static void main(String[] args) {
		EstadoCivil ec = EstadoCivil.SOLTEIRO;
		
		//tipos possiveis: byte,short,int,char,enum,String
		switch(ec) {
				case SOLTEIRO:
					System.out.println("Bóra casar?");
					break;
				case CASADO:
					System.out.println("Choppim hoje?");
					break;
				case DIVORCIADO:
					System.out.println("Outro casório ?");
					break;
				case UNIAO_ESTAVEL:
					System.out.println("Tá morando junto ?");
					break;
				case VIUVO:
					System.out.println("Namorando ?");
					break;
				default:
					System.out.println("Erro: Não existe estado civil!");
		}
	}

}
