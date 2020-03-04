public class UsaCatalogoVenda {
	
	public static void main(String[] args) {
		
		Negociavel[] produtos = new Negociavel[8];
		
		produtos[0] = new Filme("Matrix","Ficção",8.7,"Sinopse da matrix");
		produtos[1] = new Filme("Os Goonies","Aventura",4.7,"Filme antigo");
		produtos[2] = new Filme("A teia","Suspense",7.3,"Veja no sitee www.ateia");
		produtos[3] = new Jogo("River Raid","Arcade",12.3,"Atari");
		produtos[4] = new Jogo("Minecraft","Lego",26.4,"Nintendo");
		produtos[5] = new Jogo("League of Legends","Estrategia",43.1,"PC");
		produtos[6] = new Sorvete("Nestle", "Morango");
		produtos[7] = new Sorvete("Kibon", "Chocolate");
		
		GeradorDeCatalogoVenda.gerarCatalogo(produtos);
	}
}
