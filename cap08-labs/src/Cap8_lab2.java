public class Cap8_lab2 {
	
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Nenhuma idade informada!");
			System.exit(0); //aborta
		}
		
		int[] idades = new int[args.length];
		double soma = 0.0;
		
		System.out.println("---IDADES INFORMADAS---");
		for(int i=0; i<idades.length; i++) {
			idades[i] = Integer.parseInt(args[i]);
			soma += idades[i];
			System.out.printf("%d ",idades[i]);
		}
		
		double media = soma/idades.length;
		System.out.printf("\n\nM�dia das idades informadas � de %.2f anos.\n", media);
	}
}
