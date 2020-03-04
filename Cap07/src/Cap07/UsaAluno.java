package Cap07;

public class UsaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno(1234, "Fulano", 7.5);
		System.out.println("---Aluno 1---");
		a1.mostrarDados();
		
		System.out.println();
		
		Aluno a2 = new Aluno(4321, "Sicrano", 8.9);
		System.out.println("---Aluno 2---");
		a2.mostrarDados();		
		
	}
}
