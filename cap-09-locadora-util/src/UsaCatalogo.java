public class UsaCatalogo {
	
	public static void main(String[] args) {
		
		Midia[] midias = new Midia[12];
		
		midias[0] = new Filme("IT","Terror",8.2,"bom");
		midias[1] = new Filme("Matrix","Ficção",8.7,"Sinopse da matrix");
		midias[2] = new Filme("Os Goonies","Aventura",4.7,"Filme antigo");
		midias[3] = new Filme("A teia","Suspense",7.3,"Veja no sitee www.ateia");
		midias[4] = new Musica("O melhor do campo","Sertanejo",4.2,"BMG");
		midias[5] = new Musica("Elas","MPB",3.7,"Sony");
		midias[6] = new Musica("Rock Raiz", "Rock", 6.6, "BMG");
		midias[7] = new Musica("Eles & Elas","MPB",7.4,"XXX");
		midias[8] = new Jogo("Super Mario Bros","Aventura",33.1,"PS4");
		midias[9] = new Jogo("River Raid","Arcade",12.3,"Atari");
		midias[10] = new Jogo("Minecraft","Lego",26.4,"Nintendo");
		midias[11] = new Jogo("League of Legends","Estrategia",43.1,"PC");
	
		GeradorDeCatalogo.gerarCatalogo(midias);
		
	}

}
