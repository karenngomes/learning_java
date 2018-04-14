class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) {
		//double saldoTaxaNormal = super.atualiza();
		this.saldo += this.saldo * taxa * 2;
	}

	public boolean deposita(double valor) {
		if (valor < 0)
				return false;
		else {
			this.saldo += valor - 0.10;
			return true;
		}
	}

}

class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		//double saldoTaxaNormal = super.atualiza();
		this.saldo += this.saldo * taxa * 3;
	}

}

class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		System.out.println("Atualizando a conta...");
		double novoSaldo = (c.getSaldo() * selic) + c.getSaldo();
		c.setSaldo(novoSaldo);
		System.out.println("Saldo atual: " + c.getSaldo());
		this.saldoTotal += novoSaldo;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}

class TestaContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.1);
		cc.atualiza(0.1);
		cp.atualiza(0.1);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}
}