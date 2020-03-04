import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploStream2 {
	
	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();

		/* Adiciona alguns funcionarios a lista. */
		list.add(new Funcionario(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
		list.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
		list.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250.0));
		list.add(new Funcionario(1780, "João Ricardo", "Desenvolvedor", 7100.0));
		list.add(new Funcionario(5200, "Ana Maria", "Vendedor", 4100.0));
		list.add(new Funcionario(3420, "André de Souza", "Desenvolvedor", 5890.0));
		list.add(new Funcionario(3999, "Robson Gusmão", "Analista", 6500.0));
		list.add(new Funcionario(1920, "Rubens Vieira", "Coordenador", 12300.5));
		list.add(new Funcionario(2389, "Eduardo Alves", "Desenvolvedor", 3200.0));
		list.add(new Funcionario(6300, "Joana Paiva", "Atendente", 1350.0));
		list.add(new Funcionario(7651, "Ernelinsa Rodrigues", "Coordenador", 13765.0));
		list.add(new Funcionario(1234, "Paulinio Silveira", "Atendente", 2130.6));
		list.add(new Funcionario(6751, "Joanna Carvalho", "Analista", 7743.0));
		list.add(new Funcionario(3342, "Adamastor Soares", "Desenvolvedor", 8134.0));
		list.add(new Funcionario(5555, "Zimcarlos de Lima", "Vendedor", 3354.7));
		list.add(new Funcionario(988, "Sergita Huldeir", "Desenvolvedor", 6616.4));
		list.add(new Funcionario(2121, "Patricia Moura", "Analista", 5644.4));
		list.add(new Funcionario(9852, "Ribamar Silva", "Coordenador", 11900.2));
		list.add(new Funcionario(1000, "Sheilla Quintão", "Desenvolvedor", 2884.1));
		list.add(new Funcionario(6212, "Marcondes da Conceição", "Atendente", 776.5));
		list.add(new Funcionario(6212, "Marcondes da Conceição", "Desenvolvedor", 3800.5));
		list.add(new Funcionario(6212, "Marcondes da Conceição", "Analista", 4774.5));

		Stream<Funcionario> funcStream = list.stream();
		
		//1. Quantos funcionarios são desenvolvedores ?
		long cont = funcStream.filter(fun -> 
									  fun.getCargo().equalsIgnoreCase("Desenvolvedor"))
				  	.count();
		
		System.out.printf("1) %d funcionários são desenvolvedores \n",cont);		
		
		//2. Qual funcionario analista tem maior salário ?
		funcStream = list.stream();
		
		Funcionario selected = 
				funcStream.filter(fun ->  fun.getCargo().equalsIgnoreCase("Analista"))
						  .max(Comparator.comparing(Funcionario::getSalario))
						  .get();

		System.out.println("\n2) Funcionario analista tem maior salário:");
		System.out.println(selected);
		
		//3. Listar os 10 maiores salarios de funcionarios que não são coordenadores
		System.out.println("\n3) Listar os 10 maiores salarios de funcionarios que não são coordenadores:\n");
		funcStream = list.stream();
		funcStream.filter(fun ->  !fun.getCargo().equalsIgnoreCase("Coordenador"))
		  					.sorted(Comparator.comparing(Funcionario::getSalario).reversed())
		  					.limit(10)
		  					.forEach(System.out::println);
	}

}