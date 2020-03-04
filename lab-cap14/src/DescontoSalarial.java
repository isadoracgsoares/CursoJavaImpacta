public class DescontoSalarial {
	
	public static void main(String[] args) {
		
		double salariosBrutos[] = 
		 {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500 };
		
		double salariosLiquidos[] = 
			 DoubleArrayUtils
			 	.transformaValores(salariosBrutos, x->x*0.9);
		
		System.out.println("---Salários Brutos");
		DoubleArrayUtils.processaValores(salariosBrutos, 
								x-> System.out.printf("R$ %.2f ", x));
		
		System.out.println("\n---Salários Liquidos");
		DoubleArrayUtils.processaValores(salariosLiquidos, 
								x-> System.out.printf("R$ %.2f ", x));

		
//		System.out.println("---Salários Brutos");
//		for(double sBruto : salariosBrutos) {
//			System.out.printf(" R$ %.2f ",sBruto);
//		}
//		
//		System.out.println("\n---Salários Liquidos");
//		for(double sLiquido : salariosLiquidos) {
//			System.out.printf(" R$ %.2f ",sLiquido);
//		}
	}

}
