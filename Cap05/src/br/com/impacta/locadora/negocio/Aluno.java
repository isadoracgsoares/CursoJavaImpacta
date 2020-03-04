package br.com.impacta.locadora.negocio;

public class Aluno {
	
	//CAIXINHA.JOGO DE PACOTE PARA DIVERSOS INDIVIDUOS
	private int matricula;
	private String cpf;
	private String nome;
	//etc
	
	public void setMatricula(int matricula) {
		if(matricula >= 0) {
			this.matricula = matricula;
		}
	}
	public void setCpf(String cpf) {
		if(cpf.length() == 14) {
		this.cpf = cpf;
		}
	}
		
	//Livre
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
		
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}

}

//privado, publico e pacote - tirado o publico da classe ou string
