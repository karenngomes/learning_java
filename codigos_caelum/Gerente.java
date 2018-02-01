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

class TestaGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();

		gerente.setNome("Mc Donalds");
		gerente.setSenha(3445);
		gerente.setSalario(5000);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

	}
}