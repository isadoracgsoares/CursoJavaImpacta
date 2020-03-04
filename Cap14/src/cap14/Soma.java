package cap14;

public class Soma implements Operacao {

	@Override
	public double executar(double numero1, double numero2) {
		return numero1 + numero2;
	}
}
