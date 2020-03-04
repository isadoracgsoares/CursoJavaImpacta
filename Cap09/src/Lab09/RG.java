package Lab09;

public class RG {
	private String dataNasc;
	private int numero;
	
	public RG(String dataNasc, int numero) {
		this.numero = numero;
		this.dataNasc = dataNasc;
			
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
		
		
	}
}
