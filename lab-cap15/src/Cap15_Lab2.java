import java.util.ArrayList;
import java.util.List;

public class Cap15_Lab2 {

	public static void main(String[] args) {
		
		List<Estudante> estudanteList = new ArrayList<>();
		estudanteList.add(new Estudante("Joana",8.5, 8.5));
		estudanteList.add(new Estudante("Antonio",6, 9));
		estudanteList.add(new Estudante("Mariana",7.5, 9));
		estudanteList.add(new Estudante("Ricardo",7.0, 6));
		estudanteList.add(new Estudante("Gustavo",9.5, 10));
		
		estudanteList.forEach(e -> {
			double media = (e.getNotaMatematica() 
								+ e.getNotaPortugues() ) / 2;
			e.setMedia(media);
		});
		
		estudanteList.forEach(e -> 
						System.out.printf("%s teve média de %.2f\n", 
								e.getNome(),e.getMedia()));
	}

}
