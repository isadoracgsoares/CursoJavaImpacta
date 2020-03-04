
public class ExemploDecimais {
	
	public static void main(String[] args) {
		
		//Numeros decimais tem o . como separador decimal - utiliza double para numeros quebrados
		double preço1 = 15.5;
		System.out.println("O preço é de R$ " + preço1);
		
		//outro tipo é o float, necessario colocar a letra f no literal - armazena num espaço menor
		float preço2 = 23.76f;
		
		double valorGrande = 5.76E+15; // 5.76 x 10 elevado a 15 -> E "expoente base 10"
		
		System.out.println("Valor: " + valorGrande);
		
		//Outra função para exibição de variáveis
		System.out.printf("O preço é de R$ %.2f somente hoje!", preço2); //o %2.f representa o preço2 sem concatenar
		
		
	}

}
