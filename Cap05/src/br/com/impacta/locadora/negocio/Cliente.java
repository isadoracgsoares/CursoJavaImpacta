package br.com.impacta.locadora.negocio;

public class Cliente {
	
	private String nome;
	private String endereço;
	private double rendaMensal;
	public String getNome() {
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