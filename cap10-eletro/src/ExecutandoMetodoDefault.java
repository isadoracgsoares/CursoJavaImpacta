
public class ExecutandoMetodoDefault {

	public static void main(String[] args) {

		Eletrodomestico tv = new Televisao();

		tv = new Televisao();
		tv.ligar();
		tv.acionarTimer(10);
	}
}
