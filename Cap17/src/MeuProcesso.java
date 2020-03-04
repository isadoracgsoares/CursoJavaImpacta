import java.util.ArrayList;
import java.util.Collection;

public class MeuProcesso implements Runnable {

	@Override
	public void run() {
		
		Collection<Integer> numeros = new ArrayList<>(); 

		//inserindo elementos na coleção 
		for(int i=0; i < 170_000; i++) {
			numeros.add(i);
		}
		
		//snapshot em ms do momento atual
		long tInicio = System.currentTimeMillis();
		
		//Pesquisando cada um dos elementos da coleção
		System.out.println("Pesquisando... \n\n");
		for(int i=0; i < 170_000; i++) {
			if( i % 5000 == 0) {
				String nomeThread = Thread.currentThread().getName();
				System.out.printf(" %d encontrado por %s \n", i, nomeThread);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			numeros.contains(i);
		}
		
		long tFinal = System.currentTimeMillis();
		
		long duracao = tFinal - tInicio;
		
		System.out.printf("O %s demorou %d ms na pesquisa.\n", 
								numeros.getClass().getSimpleName(), duracao);

	}
}