
public class Cap10_Lab1 {

	public static void main(String[] args) {
		
		Imprimivel grafico = new Grafico();
		Imprimivel relatorio = new Relatorio();
		Imprimivel documento = () -> System.out.println("Documento sendo impresso...");
		
		grafico.imprimir();
		relatorio.imprimir();
		documento.imprimir();
		
	}

}
