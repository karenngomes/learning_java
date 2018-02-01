class Empresa {
	String nome;
	String endereco;
	private Funcionario[] empregados;
	String cnpj;
	boolean estaAtiva;
	int quantidade;

	public Empresa(int quantidadeFunc) {
		this.empregados = new Funcionario[quantidadeFunc];
	}

	public Funcionario getFuncionario (int posicao) {
		return this.empregados[posicao];
	}

	public void adiciona(Funcionario f) {
		if (quantidade >= this.empregados.length) 
			System.out.println("A empresa não tem mais vagas!");
		else {
			this.empregados[this.quantidade] = f;
			this.quantidade = this.quantidade + 1;
		}
	}

	void mostraEmpregados() {
		for (int i = 0; i < quantidade; i++) {
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

		Empresa empresa = new Empresa(4);
		//empresa.empregados = new Funcionario[4];
		Data data = new Data(3,4,2017);
		Funcionario func1 = new Funcionario(data, "Karen");
		func1.setSalario(1000);
		empresa.adiciona(func1);
		Funcionario func2 = new Funcionario(data, "Nicholas");
		func2.setSalario(1700);
		empresa.adiciona(func2);

		Funcionario func3 = new Funcionario(data, "Pedro");
		func3.setSalario(3000);
		empresa.adiciona(func3);

		System.out.println(empresa.getQuantidade());
		empresa.mostraEmpregados();

	}
}