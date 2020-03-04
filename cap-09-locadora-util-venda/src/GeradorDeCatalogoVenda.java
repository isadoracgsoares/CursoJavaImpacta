public class GeradorDeCatalogoVenda {
	
	public static void gerarCatalogo(Negociavel[] produtos) {
		System.out.println("******* CAT�LOGO DE VENDA PRODUTOS *******");
		System.out.printf("Pre�o m�nimo � R$ %.2f \n", Negociavel.precoMinimo);
		for(Negociavel produto : produtos) {
			System.out.printf("\n----%s : -----\n",produto.getClass().getSimpleName());
			System.out.println(produto);
			System.out.printf("Pre�o de Venda .... R$ %.2f \n", produto.calculaPrecoVenda());
		}
	}
	
}
