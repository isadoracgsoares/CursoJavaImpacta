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
					//contexto est�tico n�o acessa membros de inst�ncia
	}
	
	public static int getFilmesAlugados() {
		return Filme.filmesAlugados;
	}

	public void mostraDados() {
		System.out.printf("Titulo: %s \n", this.titulo);
		System.out.printf("G�nero: %s \n", this.genero);
		System.out.printf("Pre�o do Aluguel: %.2f \n", this.precoAluguel);
		System.out.printf("Sinopse: %s \n", this.sinopse);
	}

	public void setPrecoAluguel(double precoAluguel) {
		if(precoAluguel >= 0) {
			this.precoAluguel = precoAluguel;
		}else {
			System.out.printf("Valor %.2f n�o permitido!!! \n",precoAluguel);
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
			case "A��O" : case "AVENTURA": case "COM�DIA" : case "DRAMA" : 
			case "FIC��O" : case "MUSICAL" : case "DOCUMENT�RIO" : case "TERROR" :
			case "INFANTIL" : case "SUSPENSE" :
				this.genero = genero;
				break;
			default	:
				System.out.printf("G�nero %s inexistente! \n",genero);
		}
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
}
