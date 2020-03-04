package cap05;

public class UsaFilme {

	public static void main(String[] args) {
		Filme f1 = new Filme();

		f1.setTitulo("Matrix");
		f1.setGenero("Ficção");
		f1.setPrecoAluguel(8.4);
		f1.setSinopse("Filme muito bom!");

		// Imprimindo o conteudo da variável f1
		System.out.println(f1);

		System.out.println("---DADOS DE f1---");
		// Imprimindo os dados do filme
		f1.mostraDados();

		System.out.println("---DADOS DE f2---");
		Filme f2 = new Filme();
		// Imprimindo o conteudo da variável f2
		System.out.println(f2);
		
		// Imprimindo os dados do filme (valores default)
		f2.mostraDados();
	}

}
