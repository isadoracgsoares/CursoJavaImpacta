package br.com.impacta.herdeiros;

import br.com.impacta.negocio.Pessoa;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
	}
	
	public PessoaFisica() {}
	
	@Override
	public void mostraDados() {
		super.mostraDados();
		System.out.printf("CPF: %s \n", this.cpf);
	}
	
	public String getCpf() {
		return cpf;
			
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
