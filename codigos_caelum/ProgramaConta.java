//"uma variável nunca carrega um objeto, e sim uma referência para ele"
//metodos get e set são convenções, só devem ser criados quando necessario
class Conta {
	//Variáveis do tipo numerico recebem valor default (numeros é 0, boolean é false)

	int numero;
	private double saldo;
	private double limite;
	Cliente titular;
	private static int totalDeContas; //é um atributo da classe (por causa do static)

	//construtor (não é um metodo, é chamado quando está instaciando um objeto)
	Conta() {
		System.out.println("Construindo uma conta.");
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	Conta(Cliente titular) {
		this(); //chama o construtor que foi declarado acima
		this.titular = titular;
	}

	Conta(int numero, Cliente titular) {
		this(titular); //chama o construtor que foi declarado acima
		this.numero = numero;
	}

	//apenas pega o valor e retorna
	public double getSaldo() {
		return this.saldo;
	}

	//muda o valor; neste caso, esse metodo é desnecessario, pois ja existem o metodo saca() e deposita()
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return this.titular;	
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	//chama um método não com uma referência para uma Conta, e sim usando o nome da classe.
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	boolean saca(double quantidade) {
		if(this.saldo < quantidade)
			return false;
		else {
			this.saldo -= quantidade;
			return true;
		}

	}
	boolean deposita(double quantidade) {
		if (quantidade < 0)
				return false;
		else {
			this.saldo += quantidade;
			return true;
		}
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
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

class ProgramaConta {
	public static void main(String[] args) {
		
		/*
		toda vez que dá o new, ele executa o construtor da classe
		se ao criar o objeto Conta já for instaciado o obj Cliente, esse modo não dará NullPointerExpection
		*/
		Conta minhaConta = new Conta();
		/*
		não irá funcionar pois os atributos dos objetos Cliente são private
		Cliente c = new Cliente();
		
		minhaConta.titular = c;
		//minhaConta.titular.nome = "Manoel";
		
		System.out.println(minhaConta.titular.nome);
		
		minhaConta.saldo = 1000;
		
		if(!minhaConta.deposita(1000))
			System.out.println("Valor inválido! Deposite apenas valores positivos.");
		*/

		Cliente karen = new Cliente();
		//karen.nome = "Karen";
		karen.setNome("Karen");
		Conta novaConta = new Conta(3, karen);

		System.out.println(novaConta.titular.getNome());

		int total = Conta.getTotalDeContas();
		System.out.println(total);


	}
}