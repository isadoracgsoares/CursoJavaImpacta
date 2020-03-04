import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

public class MaioresSalarios {

    public static void main(String[] args) {

        double[] salariosBrutos = { 1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 
        								850.26, 3614.29, 12500.0 };
        
        DoublePredicate filtro = x -> x >= 3000;
        double[] salariosTop = DoubleArrayUtils.filtraValores
        											(salariosBrutos, filtro);

        System.out.println("--- MAIORES SALÁRIOS ---");
        DoubleConsumer processaDouble = x -> System.out.printf("R$ %.2f\n",x);
        DoubleArrayUtils.processaValores(salariosTop, processaDouble);
    }
}
