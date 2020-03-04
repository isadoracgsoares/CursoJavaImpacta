public interface Negociavel {
	
	//qualquer atributo na interface é uma constante pública da interface
	double valorMinimo = 1.99; //static public final por definição
	
	public double calculaPrecoVenda();
}
