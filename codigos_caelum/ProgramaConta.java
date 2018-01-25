class Conta {
	//Variáveis do tipo numerico recebem valor default (numeros é 0, boolean é false)

	int numero;
	String dono;
	String cpf = "123.456.789-10";
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
	boolean transferePara(Conta destino, double valor) {
		if(!this.saca(valor))
			return false;
		else {
			destino.deposita(valor);
			return true;
		}
	}

}

class ProgramaConta {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		//Nem c1 nem c2 são objetos. Eles se referem a um objeto
		c1.deposita(100);
		c2 = c1; //c2 passa a fazer referência para o mesmo objeto que c1 referencia nesse instante.
		c2.deposita(200);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

		if(c1 == c2)
			System.out.println("São as mesmas referencias!!");
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.transferePara(conta2,50);

	}
}