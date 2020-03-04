
public class MaioresSalarios {
	public static void main(String[] args) {

		double salariosBrutos[] = { 1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500 };

		double salariosTop[] = 
				DoubleArrayUtils.
					filtraValores(salariosBrutos, x -> x > 3000);
		
		System.out.println("---Sal�rios Brutos");
		DoubleArrayUtils.processaValores(salariosBrutos, 
						x-> System.out.printf("R$ %.2f ", x));
		
		System.out.println("\n---Maiores Sal�rios");
		DoubleArrayUtils.processaValores(salariosTop, 
						x-> System.out.printf("R$ %.2f ", x));
	
//		System.out.println("---Sal�rios Brutos");
//		for (double sBruto : salariosBrutos) {
//			System.out.printf(" R$ %.2f ", sBruto);
//		}
//
//		System.out.println("\n---Maiores Sal�rios");
//		for (double salario : salariosTop) {
//			System.out.printf(" R$ %.2f ", salario);
//		}
	}

}
