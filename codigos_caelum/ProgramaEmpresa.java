class Empresa {
	String nome;
	String endereco;
	Funcionario[] empregados;
	String cnpj;
	boolean estaAtiva;

	void adiciona(Funcionario f) {
		int i = this.empregados.length;
		this.empregados[i] = f;
	}

}
public static void main(String[] args) {
	
}