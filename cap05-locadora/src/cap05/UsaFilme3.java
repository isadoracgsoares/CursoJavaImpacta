package cap05;

public class UsaFilme3 {
	
	public static void main(String[] args) {
		Filme.novoAluguel();
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		Filme f3 = new Filme();
		f1.novoAluguel();
		f2.novoAluguel();
		f3.novoAluguel();
		
		System.out.println("Filmes alugados = "+ Filme.getFilmesAlugados());
		System.out.println("Filmes alugados = "+ f1.getFilmesAlugados());
		System.out.println("Filmes alugados = "+ f2.getFilmesAlugados());
		System.out.println("Filmes alugados = "+ f3.getFilmesAlugados());
	}

}
