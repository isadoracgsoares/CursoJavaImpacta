package Lab2Cap05;

public class Garagem {
	
	private Carro carroPasseio;
	private Carro carroUtilitario;
	
	public Carro getCarroPasseio() {
		return carroPasseio;
	}
	
	public void setCarroPasseio(Carro carroPasseio) {
		this.carroPasseio = carroPasseio;
	}
	
	public Carro getCarroUtilitario() {
		return carroUtilitario;
	}
	
	public void setCarroUtilitario(Carro carroUtilitario) {
		this.carroUtilitario = carroUtilitario;
	}

	public void mostraDados() {
		System.out.println("---Passeio---");
		if(this.carroPasseio != null) {
			this.carroPasseio.mostrarDados();
		}
		System.out.println("\n---Utilit�rio---");
		if(this.carroUtilitario != null) {
			this.carroUtilitario.mostrarDados();
		}
	}

}
