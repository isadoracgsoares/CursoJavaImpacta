package cap16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExemploScanner {
	
	public static void main(String[] args) {
		
		try (
				Scanner scan = new Scanner(new FileInputStream("teste.txt"));
				PrintStream output = new PrintStream("copia-teste.txt");
			){
			
			while(scan.hasNextLine()) {
				output.println(scan.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
