package br.com.impacta.negocio;

public abstract class Pessoa {
	
	private String nome;
	private String endere�o;
	
	public Pessoa(String nome, String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
		
	}
	
	public Pessoa() {}
	
	public void mostraDados() {
		System.out.printf("Nome: %s \n", this.nome);
		System.out.printf("Endere�o: %s \n", this.endere�o);	
		
	}

	protected String getNome() {   //APLICA��O PROTECTED
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;

		
	}
}
