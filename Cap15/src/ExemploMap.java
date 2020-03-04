import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		Map<String, Cliente> mapCliente = new HashMap<>();
		
		Cliente c1 = new Cliente("Fulano", "Rua A", 45, "C111");
		Cliente c2 = new Cliente("Sicrano", "Rua B", 33, "C222");
		Cliente c3 = new Cliente("Beltrano", "Rua C", 27, "C333");
		Cliente c4 = new Cliente("Xulambs", "Rua D", 87, "C444");
		Cliente c5 = new Cliente("Souza", "Rua E", 22, "C555");
		
		//Inserindo as "tuplas" no mapa
		mapCliente.put("C111", c1);
		mapCliente.put("C222", c2);
		mapCliente.put("C333", c3);
		mapCliente.put("C444", c4);
		mapCliente.put("C555", c5);
		
		//Recuperar um elemento a partir da chave
		Cliente recuperado = mapCliente.get("C333");
		System.out.printf("Cliente com chave C333 é:\n%s\n", recuperado);
		
		//Percorrer todo o map com lambda
		System.out.println("\n--- DADOS DO MAPA ---");
		mapCliente.forEach((x,y) -> System.out.printf(" %s ::: %s \n", x,y));
		
		System.out.println("\n--- DADOS DO MAPA (usando for tradicional) ---");
		for(String matricula : mapCliente.keySet()) {
			System.out.printf(" %s ::: %s \n", matricula, mapCliente.get(matricula));
		}
					
	}
}
