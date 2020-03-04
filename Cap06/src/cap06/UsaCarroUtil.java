package cap06;

import Lab2Cap05.Carro;

public class UsaCarroUtil {
	
	public static void main(String[] args) {
		Carro auto = new Carro();
		
		auto.setModelo("Vw Jetta");
		auto.setPotencia(2.0);
		auto.setCor("Vermelha");
		
		System.out.println("----ANTES DA REFORMA----");
		auto.mostrarDados();	
		
		System.out.println();
		
		CarroUtil utilitario = new CarroUtil();
		utilitario.pintar(auto,  "Verde Limão");
		
		System.out.println("----DEPOIS DA REFORMA----");
		auto.mostrarDados();		
	}
}