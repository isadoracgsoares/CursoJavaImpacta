package br.com.impacta.locadora.negocio;

public class Cliente {
	
	private String nome;
	private String enderešo;
	private double rendaMensal;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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