package impacta.java.cap05.outropacote;

import impacta.java.cap05.negocio.Pessoa;
import impacta.java.cap05.negocio.RG;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		RG rg1 = new RG();
		p1.setRegistroGeral(rg1);
		
		p1.setIdade(10);
		//p1.nome = "Joao"; //nome não acessivel diretamente
		
	}

}
