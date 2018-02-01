class ProgramaFuncionario {
	public static void main(String[] args) {
		Data data = new Data(3,4,2017);
		Funcionario f1 = new Funcionario(data, "Karen"); 
		//f1.dataDeEntrada = data;
		//f1.nome = "Hugo";
		f1.setSalario(100);
		f1.recebeAumento(50);
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario("Nich");

		System.out.println("Salario atual f1: " + f1.getSalario());
		System.out.println("Ganho anual f1: " + f1.getGanhoAnual());
		//f1.demite();
		f1.mostraFuncionario();

	}
}