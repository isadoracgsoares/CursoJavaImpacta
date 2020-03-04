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
	public void setIdade(int idade) throws IdadeInvalidaException {				//1. Criar uma instancia da Classe da exceção desejada
		if(idade < 0) {												//2. Lançar esta instancia na pilha de execução
			IdadeInvalidaException excecao = new IdadeInvalidaException("Idade negativa!");
			throw excecao;
		}
		this.idade = idade;
		
	}	

}
