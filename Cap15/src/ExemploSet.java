import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		Set<Midia> midias = new HashSet<>();
		
		midias.add(new Filme("IT", "Terror", 8.2, "bom"));
		midias.add(new Filme("Matrix", "Ficção", 8.7, "Sinopse da matrix"));
		
		midias.add(new Filme("IT","Terror",8.2,"bom"));
		midias.add(new Filme("Matrix","Ficção",8.7,"Sinopse da matrix"));
		midias.add(new Filme("Os Goonies","Aventura",4.7,"Filme antigo"));
		midias.add(new Filme("Os Goonies","Aventura",4.7,"Filme antigo"));
		midias.add(new Filme("Os Goonies","Aventura",4.7,"Filme antigo"));
		midias.add(new Filme("Os Goonies","Aventura",4.7,"Filme antigo"));
		midias.add(new Filme("Os Goonies","Aventura",4.7,"Filme antigo"));
		midias.add(new Filme("A teia","Suspense",7.3,"Veja no sitee www.ateia"));
		midias.add(new Musica("O melhor do campo","Sertanejo",4.2,"BMG"));
		midias.add(new Musica("Elas","MPB",3.7,"Sony"));
		midias.add(new Musica("Rock Raiz", "Rock", 6.6, "BMG"));
		midias.add(new Musica("Eles & Elas","MPB",7.4,"XXX"));
		midias.add(new Jogo("Super Mario Bros","Aventura",33.1,"PS4"));
		midias.add(new Jogo("River Raid","Arcade",12.3,"Atari"));
		midias.add(new Jogo("Minecraft","Lego",26.4,"Nintendo"));
		midias.add(new Jogo("League of Legends","Estrategia",43.1,"PC"));
		
		System.out.println("---MIDIAS ORIGINAIS---");
		midias.forEach(System.out::println);
		
	}
}

//Midia osGoonies = new Filme("Os Goonies", "Aventura", 4.7, "Filme antigo");
