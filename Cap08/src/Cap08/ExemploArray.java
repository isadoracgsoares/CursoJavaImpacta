package Cap08;

public class ExemploArray {
	
	public static void main(String[] args) {
		 //declaração + inicialização de um array de inteiros
		int[] idades = new int[10];
		
		//obtendo o tamanho do array
		int tamanho = idades.length;
		System.out.printf("Tamanho do array é de %d elementos \n", tamanho);
		
		//alterando um valor em algum indice especifico
		idades[7] = 87;
		
		System.out.println("\nElementos do array (sem indice)");
		//percorrendo e exibindo os valores dos elementos do array
		for(int idade : idades) {
			System.out.println(idade);
		}
		
		System.out.println("\nElementos do array (com indice)");
		//percorrendo e exibindo os valores com seus indices
		for(int i = 0; i < idades.length; i++) {
			System.out.printf("%d : %d \n", i, idades[i]);			
			
		}	
		
		System.out.println("\nElementos do array \"nomes\" (com indice) ");
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("%d : %s \n", i, nomes[i]);
		}
		
		//Outras formas de inicialização de arrays
		
		System.out.println("\nArray idades 2");
		//declaração + inicialização com elementos
		int[] idades2 = {10,11,23,45,76,87,90};
		for(int idade : idades2) {
			System.out.println(idade);
		}
	}
}

