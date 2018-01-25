class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;

	boolean saca(double quantidade) {
		if(this.saldo < quantidade)
			return false;
		else {
			this.saldo -= quantidade;
			return true;
		}

	}
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

}

class ProgramaConta {
	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;

		if(minhaConta.saca(2000))
			System.out.println("Consegui sacar");
		else
			System.out.println("Não consegui sacar");

		minhaConta.deposita(500);
		
		System.out.println("Saldo atual: " + minhaConta.saldo);

		Conta meuSonho = new Conta();
		meuSonho.saldo = 150000;
		double saldo2 = meuSonho.saldo;
		System.out.println(saldo2);

	}
}