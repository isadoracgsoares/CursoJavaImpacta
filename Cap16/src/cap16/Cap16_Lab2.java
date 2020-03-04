package cap16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {
	
	public static final String PASTA_ORIGEM =
			"C:\\User\\braulio\\Downloads\\documentos";
	public static final String PASTA_BACKUP =
			"C:\\User\\braulio\\Downloads\\backup";
	
	public static void main(String[] args) {
		try {
			Path origem = Paths.get(PASTA_ORIGEM);
			Path destino = Paths.get(PASTA_BACKUP);
			if(!Files.exists(destino)) {
				Files.createDirectory(destino);
			}
			Stream<Path> streamOrigem = Files.list(origem);
			streamOrigem.forEach(p ->{
				try {
					Files.copy(p,  destino.resolve(p.getFileName()));
				}catch (IOException e) {
					e.printStackTrace();
				}
			});
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
