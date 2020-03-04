public class GeradorDeCatalogoVenda {
	
	public static void gerarCatalogo(Negociavel[] produtos) {
		System.out.println("******* CATÁLOGO DE VENDA PRODUTOS *******");
		System.out.printf("Preço minimo é %.2f \n", Negociavel.precoMinimo);
		
		for(Negociavel produto : produtos) {
			System.out.printf("----%s : -----\n",produto.getClass().getSimpleName());
			System.out.println(produto);
			System.out.printf("Preço de Venda .... R$ %.2f \n", produto.calculaPrecoVenda());
		}
	}	
}
