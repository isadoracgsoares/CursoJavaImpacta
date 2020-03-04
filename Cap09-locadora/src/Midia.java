public abstract class Midia implements Comparable<Midia>{

	private String titulo;
	private String genero;
	private double precoAluguel;
	
	public Midia(){}
	
	public Midia(String titulo, String genero, double precoAluguel) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setPrecoAluguel(precoAluguel);
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
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return String.format("Titulo: %s \nGenero: %s \nPreço do Aluguel: %.2f\n",
									this.titulo,this.genero,this.precoAluguel); 
	}
	
	@Override
	public int compareTo(Midia outra) {
		return this.getTitulo().compareTo(outra.getTitulo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoAluguel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Midia other = (Midia) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (Double.doubleToLongBits(precoAluguel) != Double.doubleToLongBits(other.precoAluguel))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	} 
		
	
	
}

