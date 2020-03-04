import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList3 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(-4);
		numeros.add(-33);
		numeros.add(70);
		numeros.add(55);
		numeros.add(0);
		numeros.add(-32);
		numeros.add(1);
		numeros.add(15);
		numeros.add(27);
		numeros.add(65);
		
		System.out.println("--- LISTA INICIAL ---");
		numeros.forEach(x -> System.out.println(x));
		
		Collections.sort(numeros);
		System.out.println("\n--- LISTA ORDENADA ASC ---");
		numeros.forEach(x -> System.out.println(x));
	
		Collections.reverse(numeros);
		System.out.println("\n--- LISTA ORDENADA DSC ---");
		numeros.forEach(x -> System.out.println(x));
		
		int maiorElemento = Collections.max(numeros);
		int menorElemento = Collections.min(numeros);
		
		System.out.println("\n--- MAIOR ELEMENTO ---");
		System.out.printf("O maior é %s \n", maiorElemento);
		System.out.println("\n--- MENOR ELEMENTO ---");
		System.out.printf("O menor é %s \n", menorElemento);
		
		
	}
}
