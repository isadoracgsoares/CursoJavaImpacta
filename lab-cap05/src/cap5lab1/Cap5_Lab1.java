package cap5lab1;

public class Cap5_Lab1 {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.setNome("João");
		f.setSobrenome("Pedro");
		f.setSalario(4000);
		f.setCargo("Programador");
		
		System.out.printf("Nome: %s \n",f.getNome());
		System.out.printf("Sobrenome: %s \n",f.getSobrenome());
		System.out.printf("Cargo: %s \n",f.getCargo());
		System.out.printf("Salário: R$ %.2f \n",f.getSalario());
		
	}

}
