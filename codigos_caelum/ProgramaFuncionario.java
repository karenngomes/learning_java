class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;

	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("departamento: " + this.departamento);
		System.out.println("salario: " + this.salario);
		System.out.println("RG: " + this.rg);
		System.out.println("Está na empresa? " + this.estaNaEmpresa);
		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
		//System.out.println("Dia: " + this.dataDeEntrada.dia);
		//System.out.println("Mês: " + this.dataDeEntrada.mes);
		//System.out.println("Ano: " + this.dataDeEntrada.ano);
	}

	void recebeAumento(double aumento) {
		double novoSalario = this.salario + aumento;
		salario = novoSalario;
	}
	void demite() {
		if(estaNaEmpresa){
			this.estaNaEmpresa = false;
			System.out.println("Este funcionário foi demitido!");
		}
		else
			System.out.println("Este funcionario já se encontrava fora da Empresa!");
	}
	double calculaGanhoAnual(){
		return this.salario * 12;
	}

}

class Data {
	int dia;
	int mes;
	int ano;

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class ProgramaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(); 
		Data data = new Data();
		f1.dataDeEntrada = data;
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);

		System.out.println("Salario atual: " + f1.salario);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		//f1.demite();
		f1.mostra();
	}
}