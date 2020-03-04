public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Cadastro(){
	}

	public Cadastro(String nome, String sobrenome){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}
	
	public Cadastro(String nome, String sobrenome, int idade){
		this(nome,sobrenome);
		this.setIdade(idade);
	}
	
	public void mostrar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
