public class Musica extends Midia{
	
	private String gravadora;
	
	public Musica() {}
	
	public Musica(String titulo, String genero, double precoAluguel, String gravadora) {
		super(titulo,genero,precoAluguel);
		this.setGravadora(gravadora);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Gravadora: %s \n", this.gravadora);
	}

	

}
