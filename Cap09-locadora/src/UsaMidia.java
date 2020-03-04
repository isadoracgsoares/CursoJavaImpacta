public class UsaMidia {
	
	public static void main(String[] args) {
		
		Midia mid1 = new Filme("Matrix","Ficção",7.6,"bom");
		Midia mid2 = new Filme("Matrix","Ficção",7.6,"bom");
		
		//O equals herdado compara endereço de memória!
		//mid1 = mid2;
		
		if(mid1.equals(mid2)) {
			System.out.println("IGUAIS");
		}else {
			System.out.println("DIFERENTES");
		}
		
		
		System.out.println("---Midia 1---");
		System.out.println(mid1.toString());
		
		System.out.println("---Midia 2---");
		System.out.println(mid2); //internamente o println chama toString para objetos
		
		
		
		
	}

}
