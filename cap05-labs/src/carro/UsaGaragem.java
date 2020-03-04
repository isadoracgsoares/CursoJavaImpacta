package carro;

public class UsaGaragem {
	
	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		g.setCarroPasseio(new Carro());
		g.setCarroUtilitario(new Carro());
		
		g.getCarroPasseio().setModelo("Vw Jetta");
		g.getCarroPasseio().setCor("Vermelha");
		g.getCarroPasseio().setPotencia(2.0);
		
		g.getCarroUtilitario().setModelo("Renault Boxer");
		g.getCarroUtilitario().setCor("Branco");
		g.getCarroUtilitario().setPotencia(3.2);
		
		g.mostraDados();
		
	}

}
