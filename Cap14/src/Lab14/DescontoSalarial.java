package Lab14;

public class DescontoSalarial {

	public static void main(String[] args) {
		
		double salariosBrutos[] =
			{1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};
		
		double salariosLiquidos[] =
			DoubleArrayUtils.transformaValores(salariosBrutos, x -> x*.9);
		

		System.out.println("--- SALARIOS BRUTOS ---");		
		for(double sBruto : salariosBrutos) {
			System.out.printf("R$ %.2f \n", sBruto);
			
		}
		
		System.out.println("\n--- SALARIOS LIQUIDOS ---");	
		for(double sLiquido : salariosLiquidos) {
			System.out.printf("R$ %.2f \n", sLiquido);
			
		}				
	}
}
