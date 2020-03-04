import java.util.function.DoubleConsumer;
import java.util.function.DoubleUnaryOperator;

public class DescontoSalarial {

    public static void main(String[] args) {

        double[] salariosBrutos = { 1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 
        							850.26, 3614.29, 12500.0 };
        
        DoubleUnaryOperator operacaoUnaria = x -> 0.9 * x ;
        double[] salariosLiquidos = DoubleArrayUtils.transformaValores
        											(salariosBrutos, operacaoUnaria);
        
        System.out.println("--- SALÁRIOS LÍQUIDOS ---");
        DoubleConsumer processaDouble = x -> System.out.printf("R$ %.2f \n", x);
        DoubleArrayUtils.processaValores(salariosLiquidos, processaDouble);
        
    }
}
