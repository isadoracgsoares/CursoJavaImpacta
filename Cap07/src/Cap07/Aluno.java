package Cap07;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double nota;
	
	public Aluno(int matricula, String nome, double nota) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;		
	}
	
	public Aluno() {} //definido padr�o para inser��o de mais alunos
	
	//Metodo com o nome da classe - NAO � CONSTRUTOR
	public void Aluno() {
		System.out.println("Nao sou construtor, sou um m�todo comum");
	}
	
	public void mostrarDados() {
		System.out.printf("Matricula: %d \n", this.matricula);
		System.out.printf("Nome: %s \n", this.nome);
		System.out.printf("Nota: %.2f \n", this.nota);		
	}
}
