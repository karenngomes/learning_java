public class ContaCorrente extends Conta implements Tributavel {
	@Override
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
