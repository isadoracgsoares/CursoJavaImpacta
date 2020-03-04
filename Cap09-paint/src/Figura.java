public abstract class Figura {
	
	private String cor;
	
	public abstract double calculaArea();
	public abstract void desenhar();
	
	public void colorir(String cor) {
		this.cor = cor;
	}

}
