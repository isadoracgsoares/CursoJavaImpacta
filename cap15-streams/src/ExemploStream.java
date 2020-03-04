import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExemploStream {

    public static void main(String[] args) {

		/* Cria uma lista vazia de funcionarios. */
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

		// Ordenacoes, limitacoes da saida
		System.out.println("\n\n---ORDENAÇÔES---");
		funcStream.sorted()
				  .limit(5)
				  .skip(2)
				  .forEach(System.out::println);

		System.out.println("\n\n---GRUPAMENTO---");
		funcStream = list.stream();

		funcStream.sorted(Comparator.comparing(Funcionario::getNome).reversed()
									.thenComparing(Funcionario::getSalario))
				  .forEach(System.out::println);

		// Filtros
		System.out.println("\n\n---FILTROS---");
		funcStream = list.stream();

		funcStream.filter(func -> func.getSalario() > 5000 && 
								  func.getCargo().equals("Desenvolvedor"))
				.forEach(System.out::println);

		// transformacoes e reducoes
		funcStream = list.stream();
		DoubleStream salarios = funcStream.mapToDouble(func -> func.getSalario());

		DoubleSummaryStatistics sumarioSalarios = salarios.summaryStatistics();

		System.out.printf("\n\nMedia salarial: R$ %.2f \n", sumarioSalarios.getAverage());
		System.out.printf("Maior salario : R$ %.2f \n", sumarioSalarios.getMax());
		System.out.printf("Menor salario : R$ %.2f \n", sumarioSalarios.getMin());
		System.out.printf("Quantidade de salarios : %d \n", sumarioSalarios.getCount());
		System.out.printf("Soma dos salarios : R$ %.2f \n", sumarioSalarios.getSum());

	}
}
