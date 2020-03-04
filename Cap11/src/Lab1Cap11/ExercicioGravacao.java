package Lab1Cap11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

	public static void main(String[] args, char[] texto) {
		
		try {
			
		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite uma frase: ");
		String texto1 = scan.nextLine();
	
		
		PrintWriter writer = new PrintWriter("C:\\doc1.txt");
		writer.println(texto1);
		writer.close();		
		
		System.out.println("Frase gravada com sucesso.");
		
	}catch(IOException ioe) {
		System.out.println("Falha ao gravar as informações digitadas");
		ioe.printStackTrace();
	}
}
}

