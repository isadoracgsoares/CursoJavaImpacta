import java.util.Scanner;

public class Lab2Aula04 {
	
	public static void main(String[] args) {
		
		
			System.out.println("---DIAS DOS MESES---");
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o m�s desejado:");
			String mes = scan.next();
			
			switch(mes.toUpperCase()) {
				case "JANEIRO": case "MAR�O" : case "MAIO": case "JULHO" :
				case "AGOSTO" : case "OUTUBRO" : case "DEZEMBRO":
					System.out.printf("M�s de %s tem 31 dias \n", mes);
					break;
				case "FEVEREIRO":
					System.out.printf("M�s de %s tem menos de 30 dias \n", mes);
					break;
				case "ABRIL": case "JUNHO" : case "SETEMBRO" : case "NOVEMBRO":
					System.out.printf("M�s de %s tem 30 dias \n", mes);
					break;
				default:
					System.out.printf("Este m�s de %s n�o existe!",mes);
			}
			scan.close();
			
		}
		
		
			
		}
	


