public class Filme extends Midia implements Negociavel{
	
	private String sinopse;
	
	public Filme() {}
	
	public Filme(String titulo, String genero, double precoAluguel, String sinopse) {
		super(titulo,genero,precoAluguel); //chama construtor do pai
		this.setSinopse(sinopse);
	}
	
	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Sinopse: %s \n", this.sinopse);
		
	}

	@Override
	public double calculaPrecoVenda() {
		return 1.85 * this.getPrecoAluguel();
	}

}
