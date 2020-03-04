public class Conta {

	private double saldo;
	
	public synchronized void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
	}

	public synchronized void retira(double valor) {
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
	}
	
	public synchronized void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

}