import java.util.Scanner;

public class DiasDosMeses {

	public static void main(String[] args) {
		System.out.println("---DIAS DOS MESES---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o mês desejado:");
		String mes = scan.next();
		
		switch(mes.toUpperCase()) {
			case "JANEIRO": case "MARÇO" : case "MAIO": case "JULHO" :
			case "AGOSTO" : case "OUTUBRO" : case "DEZEMBRO":
				System.out.printf("Mês de %s tem 31 dias \n", mes);
				break;
			case "FEVEREIRO":
				System.out.printf("Mês de %s tem menos de 30 dias \n", mes);
				break;
			case "ABRIL": case "JUNHO" : case "SETEMBRO" : case "NOVEMBRO":
				System.out.printf("Mês de %s tem 30 dias \n", mes);
				break;
			default:
				System.out.printf("Este mês de %s não existe!",mes);
		}
		scan.close();
		
	}
}
