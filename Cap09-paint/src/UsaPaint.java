
public class UsaPaint {
	
	public static void main(String[] args) {
		//utilizar os metodos com as instancias de Figura
		Figura f = new Circulo(3.42);
		Figura f2 = new Quadrado(7.34);
		Paintbrush.desenhar(f, "Azul");
		Paintbrush.desenhar(f2, "Amarelo");
	}
}
