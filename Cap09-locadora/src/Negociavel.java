public interface Negociavel {
	
	//qualquer atributo na interface � uma constante p�blica da interface
	double valorMinimo = 1.99; //static public final por defini��o
	
	public double calculaPrecoVenda();
}
