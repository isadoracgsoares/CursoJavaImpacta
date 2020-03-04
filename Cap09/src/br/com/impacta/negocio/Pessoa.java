package br.com.impacta.negocio;

public abstract class Pessoa {
	
	private String nome;
	private String endereço;
	
	public Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
		
	}
	
	public Pessoa() {}
	
	public void mostraDados() {
		System.out.printf("Nome: %s \n", this.nome);
		System.out.printf("Endereço: %s \n", this.endereço);	
		
	}

	protected String getNome() {   //APLICAÇÂO PROTECTED
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;

		
	}
}
