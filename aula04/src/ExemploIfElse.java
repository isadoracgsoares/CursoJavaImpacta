/*
 * 1. Estrutura Minima:
 * 
 * 	If(condição boolean){
 * 		[codigo se condição for true]
 * 	}
 * 
 * 2. Estrutura com else:
 * 
 * 	If(condição boolean){
 * 		[codigo se condição for true]
 * 	}else{
 * 		[codigo de condição for false]
 * 	}
 * 
 */		
		 
public class ExemploIfElse {
	
	public static void main(String[] args) {
		
		int idade = 10;
		
		//EXEMPLO 1		
		if(idade < 18) {
			int x = 5; //acessivel apenas dentro do bloco deste "if"
			System.out.println("Idade menor");
		}
			//sysout (x) daria erro pois esta fora do escopo das conchaves { }
		
		//EXEMPLO 2
		if(idade > 18) {
			int x = 5; //acessivel apenas dentro do bloco deste "if"
			System.out.println("Idade menor");
		}else {
			System.out.println("Idade maior");
		}
		
		int nota = 2;
		
		if(nota >= 9) {
			System.out.println("Conceito A");
		}else if(nota >= 8 && nota < 9) {
			System.out.println("Conceito B");
		}else if(nota >= 7 && nota < 8) {
			System.out.println("Conceito C");
		}else if(nota >= 6 && nota < 7) {
			System.out.println("Conceito D");
		}else {
			System.out.println("Reprovado");
		}
	}
	
}
