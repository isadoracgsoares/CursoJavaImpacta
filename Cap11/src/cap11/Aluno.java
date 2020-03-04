package cap11;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws IdadeInvalidaException {				//1. Criar uma instancia da Classe da exce��o desejada
		if(idade < 0) {												//2. Lan�ar esta instancia na pilha de execu��o
			IdadeInvalidaException excecao = new IdadeInvalidaException("Idade negativa!");
			throw excecao;
		}
		this.idade = idade;
		
	}	

}
