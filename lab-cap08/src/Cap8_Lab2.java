public class Cap8_Lab2 {
	
	public static void main(String[] args) {
		if(args.length > 0) {
			int idades[] = converter(args);
			double media = calcularMedia(idades);
			
			exibirIdades(idades);
			System.out.printf("\n\nA média das idades acima é de %.2f anos.",
								media);
		}else {
			System.out.println("Insira valores válidos para as idades");
		}
	}
	private static void exibirIdades(int[] idades) {
		System.out.println("---Idades---");
		for (int idade : idades) {
			System.out.printf("%d ",idade);
		}
	}
	private static double calcularMedia(int[] idades) {
		double soma = 0.0;
		for (int idade : idades) {
			soma += idade;
		}
		return soma / idades.length;
	}
	
	private static int[] converter(String[] args) {
		int[] numeros = new int[args.length];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(args[i]);
		}
		
		return numeros;
	}
	

	

}
