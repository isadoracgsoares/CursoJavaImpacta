package br.com.impacta.locadora.Lab1Cap05;

public class UsarFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Isadora");
		f1.setSobrenome("Soares");
		f1.setCargo("Secretaria Executiva");
		f1.setSalario(7000);
		
		System.out.println("-------Funcionario 1-------");
		System.out.printf("Nome 1: %s \n", f1.getNome());
		System.out.printf("Sobrenome 1: %s \n", f1.getSobrenome());
		System.out.printf("Cargo 1: %s \n", f1.getCargo());
		System.out.printf("Salario 1: %.2f \n", f1.getSalario());	
		
	}
}
