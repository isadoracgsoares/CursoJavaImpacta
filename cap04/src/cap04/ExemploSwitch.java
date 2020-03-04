package cap04;

public class ExemploSwitch {
	
	public static void main(String[] args) {
		EstadoCivil ec = EstadoCivil.SOLTEIRO;
		
		//tipos possiveis: byte,short,int,char,enum,String
		switch(ec) {
				case SOLTEIRO:
					System.out.println("B�ra casar?");
					break;
				case CASADO:
					System.out.println("Choppim hoje?");
					break;
				case DIVORCIADO:
					System.out.println("Outro cas�rio ?");
					break;
				case UNIAO_ESTAVEL:
					System.out.println("T� morando junto ?");
					break;
				case VIUVO:
					System.out.println("Namorando ?");
					break;
				default:
					System.out.println("Erro: N�o existe estado civil!");
		}
	}

}
