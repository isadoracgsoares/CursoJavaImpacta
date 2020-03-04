
public class ExemploDecimais {
	
	public static void main(String[] args) {
		
		//Numeros decimais tem o . como separador decimal - utiliza double para numeros quebrados
		double pre�o1 = 15.5;
		System.out.println("O pre�o � de R$ " + pre�o1);
		
		//outro tipo � o float, necessario colocar a letra f no literal - armazena num espa�o menor
		float pre�o2 = 23.76f;
		
		double valorGrande = 5.76E+15; // 5.76 x 10 elevado a 15 -> E "expoente base 10"
		
		System.out.println("Valor: " + valorGrande);
		
		//Outra fun��o para exibi��o de vari�veis
		System.out.printf("O pre�o � de R$ %.2f somente hoje!", pre�o2); //o %2.f representa o pre�o2 sem concatenar
		
		
	}

}
