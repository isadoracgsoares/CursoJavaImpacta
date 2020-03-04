package cap14;

public class Calculadora {
	
	public static double calcular(Operacao op, double a, double b) {
		return op.executar(a, b);
	}
}
