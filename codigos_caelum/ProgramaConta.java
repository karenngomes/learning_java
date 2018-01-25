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
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		//Nem c1 nem c2 são objetos. Eles se referem a um objeto
		c1.deposita(100);
		c2 = c1; //c2 passa a fazer referência para o mesmo objeto que c1 referencia nesse instante.
		c2.deposita(200);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

	}
}