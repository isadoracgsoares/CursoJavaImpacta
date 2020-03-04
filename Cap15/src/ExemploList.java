import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Joana");
		nomes.add("Zoroastro");
		nomes.add("Sicrano");
		nomes.add("Fulano");
		nomes.add("Ana");
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Fernanda");
		nomes.add("Ruy");		
		nomes.add("Bruno");
		nomes.add("Fernanda");
		nomes.add("Marcos");
		nomes.add("Pedro");
		nomes.add("Beltrano");
		nomes.add("Marcela");
		
		System.out.println("---Nomes---"); //Filtra nomes/elementos repetidos
		nomes.forEach(System.out::println);
		
		nomes.remove("Maria");
		System.out.println("\n--- Nomes Depois de remover Maria ---");
		nomes.forEach(System.out::println);
		
		nomes.removeIf(x -> true);
		System.out.println("\n--- Nomes Depois de remover If ---");
		nomes.forEach(System.out::println);
		
		nomes.removeIf(x -> x.equals("Maria"));
		System.out.println("\n--- Nomes Depois de remover If de todas as Maria ---");
		nomes.forEach(System.out::println);
		
		System.out.println("\n--- Quantidade de Elementos agora: ---");
		System.out.printf("Temos %d nomes da coleção! \n", nomes.size());
		
		System.out.println("\n--- Pesquisando um Elemento ---");
		String nomePesquisado = "Zoroastro";
		if(nomes.contains(nomePesquisado)) {
			System.out.printf("%s está na coleção!", nomePesquisado);
		}else {
			System.out.printf("%s NÃO está na coleção!", nomePesquisado);
			
		}		
	}
}
