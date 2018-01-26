class Pessoa {
	String nome;
	int idade;

	void fazAniversario() {
		this.idade = this.idade + 1;
	}

}

class ProgramaPessoa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		p1.nome = "Karen";
		p1.idade = 18;

		//18 + 3
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();

		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);

	}
}