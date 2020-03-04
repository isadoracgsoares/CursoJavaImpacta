package br.com.impacta.locadora.principal;

import br.com.impacta.locadora.negocio.Aluno;

public class UsarAluno {
	
	public static void main(String[] args) {
		
		Aluno al1 = new Aluno(); //instancia��o
		
		al1.setCpf("111.111.111-11");
		al1.setMatricula(123456);
		al1.setNome("Fulano Soares");
		
		System.out.println("-------Aluno 1-------");
		System.out.printf("Cpf 1: %s \n", al1.getCPF());
		System.out.printf("Nome 1: %s \n", al1.getNome());
		System.out.printf("Matricula 1: %s \n", al1.getMatricula());
		//Impressao sempre depois das atribui��es senao fica null/0
		
		System.out.println();
		
		System.out.println("---------- valor de al1 -------------");
		System.out.println("al1: " + al1);
		
		
		Aluno al2 = new Aluno(); //instancia��o
		al2.setCpf("222.222.222-22");
		al2.setMatricula(789456);
		al2.setNome("Sicrano Soares");
		
		System.out.println();
		
		System.out.println("---------- valor de al2 -------------");
		System.out.println("al2: " + al2);
		
		al2 = null; //apago o endere�o de memoria em al2. Libera a �rea de memoria para preencher novos dados.
		System.out.println("al2 foi anulado: " + al2);
		
		//Ocorre uma exce��o (erro) em tempo de execu��o "referencia nula"
		//al2.matricula = 123;
		
		//atribui��o de uma vari�vel a outra 
		al2 = al1;
		System.out.println(al2);
		
		
	}

}
