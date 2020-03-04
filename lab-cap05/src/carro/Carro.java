package carro;

public class Carro {
	
	private String modelo;
	private String cor;
	private double potencia;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		if(potencia > 0) {
			this.potencia = potencia;
		}
	}
	public void mostrarDados() {
		System.out.printf("Modelo: %s \n",this.modelo);
		System.out.printf("Cor: %s \n",this.cor);
		System.out.printf("Potência: %.2f cv\n",this.potencia);
	}
	

}
