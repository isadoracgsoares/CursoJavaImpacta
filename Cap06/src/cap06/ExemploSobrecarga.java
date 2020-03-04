package cap06;

public class ExemploSobrecarga {
	
	public void imprimir(String s) {
		System.out.println(s);
	}
	
	public void imprimir(int i) {
		System.out.println(i);
	}
	
	public void imprimir(String s, int i) {
		System.out.println(s + i);
	}
	
	public void imprimir(int i, String s) {
		System.out.println(i + s);
	}
}
