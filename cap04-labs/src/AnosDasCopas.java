import java.time.Year;

public class AnosDasCopas {
	
	public static void main(String[] args) {
		System.out.println("---ANOS DE COPA DO MUNDO---");
		int anoInicial = 1930;
		int anoCorrente = Year.now().getValue(); //ano corrente
		
		for(int i=anoInicial; i<=anoCorrente; i+=4) {
			if(i == 1942 || i == 1946) {
				continue;
			}
			System.out.println(i);
		}
	}

}
