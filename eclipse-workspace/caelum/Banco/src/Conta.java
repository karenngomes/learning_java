
public abstract class Conta {
	protected double saldo;
	protected double limite;
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return this.limite;
	}

	public boolean saca(double quantidade) {
		if (quantidade > this.saldo + this.limite){
			System.out.println("Não posso sacar fora do limite!");
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;
		}

	}
	
	abstract void atualiza(double taxaSelic);
	
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
