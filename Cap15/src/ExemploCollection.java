import java.util.HashSet;
import java.util.Set;

public class ExemploCollection {
	
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>();
		
		nomes.add("Joana");
		nomes.add("Marcela");
		nomes.add("Mario");
		nomes.add("Fernanda");
		nomes.add("Ruy");
		nomes.add("Ana");
		nomes.add("Fulano");
		nomes.add("Sicrano");
		nomes.add("José");
		nomes.add("Bruno");
		nomes.add("Fernanda");
		nomes.add("Marcos");
		nomes.add("Pedro");
		nomes.add("Beltrano");
		nomes.add("Marcela");
		
		System.out.println("---Nomes---"); //Filtra nomes/elementos repetidos
		nomes.forEach(System.out::println);
	}

}
