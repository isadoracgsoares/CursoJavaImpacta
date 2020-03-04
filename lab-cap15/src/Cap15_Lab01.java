import java.util.HashMap;
import java.util.Map;

public class Cap15_Lab01 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> pessoaMap = new HashMap<>();//new TreeMap<>();
		
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel",18);
		pessoaMap.put("Bruna", 17);
		
		System.out.println("------ CHAVES-VALORES USANDO get --------");
		for(String chave : pessoaMap.keySet()) {
			System.out.printf(" %s : %d \n", chave, pessoaMap.get(chave));
		}
		
		System.out.println("\n------ CHAVES-VALORES USANDO lambda --------");
		pessoaMap.forEach((k,v) -> System.out.printf(" %s : %d \n", k, v));
		
	}

}
