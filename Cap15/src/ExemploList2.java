import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList2 {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Joana");
		nomes.add("Zoroastro");
		nomes.add("Sicrano");
		nomes.add("Fulano");
		nomes.add("Ana");
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Clara");
		nomes.add("Marcos");
		nomes.add("Pedro");
		nomes.add("Beltrano");
		
		System.out.println("--- LISTA INICIAL ---");
		nomes.forEach(x -> System.out.println(x));
		
		Collections.sort(nomes);
		System.out.println("\n--- LISTA ORDENADA ASC ---");
		nomes.forEach(x -> System.out.println(x));
	
		Collections.reverse(nomes);
		System.out.println("\n--- LISTA ORDENADA DSC ---");
		nomes.forEach(x -> System.out.println(x));
		
		String maiorElemento = Collections.max(nomes);
		String menorElemento = Collections.min(nomes);
		
		System.out.println("\n--- MAIOR ELEMENTO ---");
		System.out.printf("O maior é %s \n", maiorElemento);
		System.out.println("\n--- MENOR ELEMENTO ---");
		System.out.printf("O menor é %s \n", menorElemento);
		
		
	}
}
