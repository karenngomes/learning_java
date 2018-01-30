//"uma variável nunca carrega um objeto, e sim uma referência para ele"
class Conta {
	//Variáveis do tipo numerico recebem valor default (numeros é 0, boolean é false)

	int numero;
	private double saldo;
	private double limite;
	Cliente titular = new Cliente();//Quando chamarem new Conta, haverá um new Cliente para ele

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

class Cliente {
	String nome;
	String sobrenome;
	String cpf;
}

class ProgramaConta {
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		//Cliente c = new Cliente();
		//minhaConta.titular = c;
		//como, ao criar o objeto Conta já foi instaciado o obj Cliente, esse modo não dará NullPointerExpection
		//minhaConta.titular.nome = "Manoel";
		//System.out.println(minhaConta.titular.nome);
		minhaConta.saldo = 1000;

	}
}