package cap16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeituraArquivo {
	
	public static void main(String[] args) {
		
		try ( InputStream is = new FileInputStream("teste.txt"); 
			  InputStreamReader isr = new InputStreamReader(is);
			  BufferedReader br = new BufferedReader(isr);	
			) {
			
			String linhaLida = br.readLine();
			while(linhaLida != null ) {
				System.out.println(linhaLida);
				linhaLida = br.readLine();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
