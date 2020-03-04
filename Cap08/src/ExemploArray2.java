
public class ExemploArray2 {
	
	 
	 
	public static void main(String[] args) {
		Midia[] filmes = new Midia[3];
		
		Midia f1 = new Filme("Matrix","Ficção",5.3, "bom");
		Midia f2 = new Filme("Roma","Drama",4.6, "bom");
		
		filmes[0] = new Filme();
		filmes[1] = f1;
		filmes[2] = f2;
		
		f1 = null;
		f2 = null;
		
		for(Midia f : filmes) {
			f.mostrarDados();
		}
	}	
}

