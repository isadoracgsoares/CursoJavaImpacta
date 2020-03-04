package cap03;

public class ExemploOperadorTernario {
	
	public static void main(String[] args) {
		/*
		 * Conhecido como "if reduzido"
		 * 
		 * (expressao booleana) ? [retorno-se-true] : [retorno-se-false];
		 * 		  
		 */
		
		String maioridade;
		int idade = 17;
		
		maioridade = (idade >= 18) ? "É maior" : "É menor";
		
		System.out.printf("Pessoa com idade de %d anos : %s ",idade,maioridade);
		
		
		
	}

}
