package cap11;

public class UsaAluno {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		try {
			a1.setIdade(-23);
			System.out.printf("Idade do aluno é de %d anos.", a1.getIdade());
		} catch (IdadeInvalidaException e) {
			System.out.println("Erro: " + e.getMessage());			
		}
	}
}
