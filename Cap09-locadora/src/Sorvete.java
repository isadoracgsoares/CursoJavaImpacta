public class Sorvete implements Negociavel{
	
	private String marca;
	private String sabor;
	
	public Sorvete(String marca, String sabor) {
		this.setMarca(marca);
		this.setSabor(sabor);
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return String.format("\nMarca: %s\nSabor %s\n" , this.marca, this.sabor);
	}

	@Override
	public double calculaPrecoVenda() {
		return 2.5;
	}

}
