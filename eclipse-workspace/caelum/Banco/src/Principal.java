
class Principal {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
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
		
		System.out.println("============");
		
		Conta cc2 = new ContaCorrente();
		
		cc2.deposita(200);
		
		/*
		try {
			cc2.saca(10);
			System.out.println("Consegui sacar da corrente");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}*/
		
		Conta cp2 = new ContaPoupanca();
		
		
		try {
			cp2.deposita(-400);
		} catch(ValorInvalidoException x) {
			System.out.println(x.getMessage());
		} finally {
			cp2.deposita(0);
		}
		
		try {
			cc2.saca(400);
			System.out.println("Consegui sacar da corrente");
			cp2.saca(400);
			System.out.println("Consegui sacar da poupanca");
		} catch (SaldoInsuficienteException y) {
			System.out.println(y.getMessage());
		}


	}
}
