class Empresa {
	String nome;
	String endereco;
	Funcionario[] empregados;
	String cnpj;
	boolean estaAtiva;
	int quantidade;

	public void adiciona(Funcionario f) {
		if (quantidade >= this.empregados.length) 
			System.out.println("A empresa não tem mais vagas!");
		else {
			this.empregados[this.quantidade] = f;
			this.quantidade = this.quantidade + 1;
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.quantidade; i++) {
			System.out.println("Funcionário na posição: " + (i + 1));
			this.empregados[i].mostraFuncionario();
		}
	}

	public int getQuantidade() {
		return this.quantidade;
	}

}
class ProgramaEmpresa {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[4];

		Funcionario func1 = new Funcionario("Karen");
		func1.setSalario(1000);
		empresa.adiciona(func1);
		Funcionario func2 = new Funcionario("Nicholas");
		func2.setSalario(1700);
		empresa.adiciona(func2);

		Funcionario func3 = new Funcionario("Pedro");
		func3.setSalario(3000);
		empresa.adiciona(func3);

		System.out.println(empresa.getQuantidade());
		empresa.mostraEmpregados();

	}
}