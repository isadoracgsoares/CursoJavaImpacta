
public class Cliente {

	private String nome;
	private String enderešo;
	private int idade;
	private String matricula;
		
	public Cliente(String nome, String enderešo, int idade, String matricula) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome = " + nome + ", enderešo = " + enderešo + ", idade = " + idade + ", matricula = " + matricula
				+ "]";
	}	
}