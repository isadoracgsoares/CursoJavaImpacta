package cap06;

public class SomaCombo {

	public static int somar(int ... numeros) {
		
		int resultado = 0;
		
		for(int num : numeros) {
			resultado += num;
			
		}
		return resultado;
		
	}
}
