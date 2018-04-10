class Gerente extends Funcionario {
	
	private int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}

class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}

class TestaGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();

		gerente.setNome("Mc Donalds");
		gerente.setSenha(3445);
		gerente.setSalario(5000);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

		Gerente g = new Gerente();
		Funcionario f = g;

		f.setSalario(1000);
		
		//Método executado será o do Gerente (executa relacionando com sua classe de verdade)
		System.out.println(f.getBonificacao());
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000);
		controle.registra(funcionario2);

		System.out.println(controle.getTotalDeBonificacoes());


	}
}