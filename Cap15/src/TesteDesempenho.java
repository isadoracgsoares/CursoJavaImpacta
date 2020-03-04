import java.util.ArrayList;
import java.util.Collection;

public class TesteDesempenho {

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<>(); //TreeSet ou LinkedList ou HashSet (tem que importar para todos)

		//inserindo elementos na coleção 
		for(int i=0; i < 200_000; i++) {
			numeros.add(i);
		}
		
		//snapshot em ms do momento atual
		long tInicio = System.currentTimeMillis();
		
		//Pesquisando cada um dos elementos da coleção
		System.out.println("Pesquisando... \n\n");
		for(int i=0; i < 200_000; i++) {
			numeros.contains(i);
		}
		
		long tFinal = System.currentTimeMillis();
		
		long duracao = tFinal - tInicio;
		
		System.out.printf("O %s demorou %d ms na pesquisa.\n", 
								numeros.getClass().getSimpleName(), duracao);
		
	}

}
