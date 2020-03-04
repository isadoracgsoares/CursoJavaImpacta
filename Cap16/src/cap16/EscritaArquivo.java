package cap16;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscritaArquivo {
	
	public static void main(String[] args) {
		
		try (
				OutputStream out = new FileOutputStream("saida.txt",true);
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
			){
			
			bw.write("Linha 1");
			bw.newLine();
			bw.write("Linha 2");
			bw.newLine();
			bw.write("Linha 3");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
