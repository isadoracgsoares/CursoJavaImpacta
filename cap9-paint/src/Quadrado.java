
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
		System.out.printf("Quadrado de �rea %.2f cm� desenhado!",
							this.calculaArea());
	}

}
