public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public void desenhar() {
		System.out.printf("Circulo de área %.2f cm2. desenhado! \n", this.calculaArea());		
	}
}
