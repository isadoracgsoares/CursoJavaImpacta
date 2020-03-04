
public class Quadrado extends Figura {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public void desenhar() {
		System.out.printf("Quadrado de área %.2f cm² desenhado!",
							this.calculaArea());
	}

}
