/*
 * 
 * Operador ternario do java
 * 
 * (expressão-booleana) ? (retorno_se_true) : (retorno_se_true)
 * 
 */
public class OperadorTernario {
	
	
	public static void main(String[] args) {
		
		int idade = 19;
		String maioridade;
		
		maioridade = (idade >= 18)? "Maior" : "Menor";
		
		System.out.printf("Idade igual a %d anos é considerado %s que 18 anos.", idade, maioridade);
	}
}
