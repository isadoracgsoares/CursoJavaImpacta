package cap05;

public class UsaFilme2 {
	
	public static void main(String[] args) {
		
		Filme f1 = new Filme();
		
		f1.setTitulo("Teste");
		f1.setGenero("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		f1.setPrecoAluguel(-145_678_000);
		f1.setSinopse("Sinopse do filme...");
		
		f1.mostraDados();
		
	}

}
