package br.com.impacta.principal;

import br.com.impacta.herdeiros.PessoaFisica;
import br.com.impacta.herdeiros.PessoaJuridica;
import br.com.impacta.negocio.Pessoa;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new PessoaFisica();
		PessoaFisica p2 = new PessoaFisica();
		PessoaJuridica p3 = new PessoaJuridica();
		
		System.out.println("---Pessoa 1---");
		p1.mostraDados();
		
		System.out.println("\n---Pessoa 2---");
		p2.mostraDados();
		
		System.out.println("\n---Pessoa 3---");
		p3.mostraDados();
		
	}
}
