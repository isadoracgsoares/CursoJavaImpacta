import java.time.Year;
import java.util.Scanner;

public class ExercicioIdade {

    public static void main(String[] args) {

        try {
        	Scanner scanner = new Scanner(System.in);
        	
        	System.out.println("Digite o ano de seu nascimento: ");
            String anoStr = scanner.nextLine();
            
            int ano = Integer.parseInt(anoStr);
            int idade = Year.now().getValue() - ano;
            
            System.out.println("Voc� possui " + idade + " anos de idade.");

        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inv�lido");
        }
    }
}
