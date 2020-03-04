public class GeradorDeCatalogo {
	
	public static void gerarCatalogo(Midia[] midias) {
		System.out.println("******* CATÁLOGO DE MIDIAS *******");
		for(Midia midia : midias) {
			System.out.println(midia.getClass().getSimpleName()+":");
			System.out.println(midia);
			System.out.println("-----------------------------\n");
		}
	}
}
