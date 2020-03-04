package br.com.impacta.exnegocio;

public class Veiculo {
	
	private double potencia;
	private String marca;
	
	public Veiculo (double potencia, String marca) {
		this.potencia = potencia;
		this.marca = marca;
		
	}
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public void mostraDados() {
		System.out.printf("Potencia do veiculo: %d \n", this.potencia);
		System.out.printf("Marca do veiculo: %s \n", this.marca);
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
