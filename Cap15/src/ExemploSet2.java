import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploSet2 {

	public static void main(String[] args) {
		
		List<Midia> midias = new ArrayList<>();
		
		midias.add(new Filme("IT", "Terror", 8.2, "bom"));
		midias.add(new Filme("Matrix", "Fic��o", 8.7, "Sinopse da matrix"));
		
		midias.add(new Filme("IT","Terror",8.2,"bom"));
		midias.add(new Filme("Matrix","Fic��o",8.7,"Sinopse da matrix"));
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
		
		System.out.println("---MIDIAS ORDENADAS TITULO ASC---");
		Collections.sort(midias);
		midias.forEach(System.out::println);
		
		System.out.println("---MIDIAS ORDENADAS PRE�O ASC---");
		Collections.sort(midias, new ComparadorMidiaPorPreco());
		midias.forEach(System.out::println);
		
	}
}