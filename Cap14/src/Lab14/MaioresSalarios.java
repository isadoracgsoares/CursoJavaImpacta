package Lab14;

public class MaioresSalarios {	
	public static void main(String[] args) {
		
		double salariosBrutos[] = {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};
		
		double salariosTop[] =
			DoubleArrayUtils.filtraValores(salariosBrutos, x -> x > 3000);
		
		System.out.println("--- SALARIOS BRUTOS ---");		
		for(double sBruto : salariosBrutos) {
			System.out.printf("R$ %.2f \n", sBruto);
			
		}
		
		System.out.println("\n--- MAIORES SALARIOS ---");	
		for(double salario : salariosTop) {
			System.out.printf("R$ %.2f \n", salario);
		
		}
		
		//System.out.println("--- SALARIOS BRUTOS ---");
		//DoubleArraysUtils.processaValores(salariosBrutos, x -> Sysout.out.printf("R$ %.2f", x));
		
		//System.out.println("--- MAIORES SALARIOS ---");
		//DoubleArraysUtils.processaValores(salariosTop, x -> Sysout.out.printf("R$ %.2f", x));
		
			
		}		
}

