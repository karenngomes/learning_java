
public class Conta {
	private double saldo;

	boolean saca(double quantidade) {
		if(this.saldo < quantidade)
			return false;
		else {
			this.saldo -= quantidade;
			return true;
		}

	}
	
	void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
