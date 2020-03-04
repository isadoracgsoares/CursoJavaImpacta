package br.com.impacta.herdeiros;

import br.com.impacta.negocio.Pessoa;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public void mostraDados() {
		super.mostraDados();
		System.out.printf("CNPJ: %s \n", this.cnpj);
	}
	
	public String getCnpj() {
		return cnpj;
			
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	

}
