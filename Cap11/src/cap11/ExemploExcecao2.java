package cap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploExcecao2 {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando o programa...");
		
		//codigo para abrir um arquivo
		try {
			abrir("Teste.txt");
		} catch (IOException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
		System.out.println("Finalizando o programa");
		
	}
	
	private static void abrir(String path) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		System.out.println("Arquivo foi aberto!");
		fis.close(); //fechando o arquivo		
		
	}		
	
}