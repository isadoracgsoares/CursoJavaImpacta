import java.util.Comparator;

public class ComparaMidiaPorPrecoAluguel implements Comparator<Midia>{

	@Override
	public int compare(Midia mid1, Midia mid2) {
		
		if(mid1.getPrecoAluguel() > mid2.getPrecoAluguel()) {
			return 1; //qualquer numero maior que zero 
		}
		
		if(mid1.getPrecoAluguel() < mid2.getPrecoAluguel()) {
			return -1; //qualquer numero menor que zero
		}
		
		return 0; //chegou aqui, são iguais
	}

	
}
