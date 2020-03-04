package br.com.impacta.locadora.negocio;

public class Cliente {
	
	private String nome;
	private String endere�o;
	private double rendaMensal;
	public String getNome() {
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
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		if(rendaMensal > 0) {
			this.rendaMensal = rendaMensal;
		}		
	}
}

//Barra de Ferramentas - Aba Source - Generate Getter and Setter para criar automaticamente