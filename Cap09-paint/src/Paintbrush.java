public class Paintbrush {
	
	public static void desenhar(Figura figura, String cor) {

		//calculando a area do desenho
		double area = figura.calculaArea();
		
		//aloca a area para o desenho e desenha a figura
		figura.desenhar();
		figura.colorir(cor);
	}

}
