package Cap15_Lab01;

import java.util.HashMap;

public class Cap15_Lab1 {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> pessoaMap = new HashMap<>();
		
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);
		
		System.out.println("-- Pessoa -- (get)");
		for(String chave : pessoaMap.keySet()) {
			System.out.printf(" %s : %d \n", chave, pessoaMap.get(chave));
		}
		
		System.out.println("\n-- Pessoas -- (lambda)"); 
		pessoaMap.forEach((x,y) -> System.out.printf(" %s: %s \n", x,y));		
		
	}
}
