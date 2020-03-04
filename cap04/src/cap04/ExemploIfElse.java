package cap04;

public class ExemploIfElse {
	
	public static void main(String[] args) {
		
		int a = 50;
		
		if(a > 10) {
			int b = 100;
			System.out.printf("%d maior que dez! \n", a);
		}else {
			System.out.printf("%d menor ou igual que dez! \n",a);
			//System.out.println(b); //b fora do escopo 
		}
		
		//Exemplo com else if
		int nota = 8;
		
		if(nota > 8) {
			System.out.println("Excelente!");
		}else if( (nota > 7) && (nota<=8) ){
			System.out.println("Ótimo!");
		}else if( (nota > 6) && (nota<=7)) {
			System.out.println("Bom!");
		}else {
			System.out.println("Ruim!");
		}
		
	}

}
