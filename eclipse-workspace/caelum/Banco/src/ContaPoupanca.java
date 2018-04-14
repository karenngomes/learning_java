
public class ContaPoupanca extends Conta {
	
	@Override
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa * 3;
	}
}
