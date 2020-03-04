public class Jogo extends Midia implements Negociavel{
	
	private String console;
	
	public Jogo() {}
	
	public Jogo(String titulo, String genero, double precoAluguel, String console) {
		super(titulo,genero,precoAluguel);
		this.setConsole(console);
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Console: %s \n", this.console);
	}
	
	@Override
	public double calculaPrecoVenda() {
		return 3.17 * this.getPrecoAluguel();
	}

}
