package cap05;

public class Filme {
	
	private String titulo;
	private String genero;
	private double precoAluguel;
	private String sinopse;
	private static int filmesAlugados; //atributo da classe
	
	public static void novoAluguel() {
		Filme.filmesAlugados++;
		//titulo = "Teste"; ERRO:
					//contexto estático não acessa membros de instância
	}
	
	public static int getFilmesAlugados() {
		return Filme.filmesAlugados;
	}

	public void mostraDados() {
		System.out.printf("Titulo: %s \n", this.titulo);
		System.out.printf("Gênero: %s \n", this.genero);
		System.out.printf("Preço do Aluguel: %.2f \n", this.precoAluguel);
		System.out.printf("Sinopse: %s \n", this.sinopse);
	}

	public void setPrecoAluguel(double precoAluguel) {
		if(precoAluguel >= 0) {
			this.precoAluguel = precoAluguel;
		}else {
			System.out.printf("Valor %.2f não permitido!!! \n",precoAluguel);
		}
	}
	
	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		
		switch(genero.toUpperCase()) {
			case "AÇÂO" : case "AVENTURA": case "COMÈDIA" : case "DRAMA" : 
			case "FICÇÃO" : case "MUSICAL" : case "DOCUMENTÁRIO" : case "TERROR" :
			case "INFANTIL" : case "SUSPENSE" :
				this.genero = genero;
				break;
			default	:
				System.out.printf("Gênero %s inexistente! \n",genero);
		}
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
}
