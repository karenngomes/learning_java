class Funcionario {
	String nome;
	String departamento;
	private double salario;
	Data dataDeEntrada;
	private String rg;
	boolean estaNaEmpresa;
	private static int identificador;

	void mostraFuncionario(){
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

	public Funcionario(){
		Funcionario.identificador = Funcionario.identificador + 1;
	}

	public Funcionario(String nome) {
		this();
		this.nome = nome; 
	}

	public Funcionario(Data dataInicio, String nomeFunc) {
		this(nomeFunc);
		this.dataDeEntrada = dataInicio;
	}

	public static int getIdFuncionario() {
		return Funcionario.identificador;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public String getRg(){
		return this.rg;
	}

	public void setRg(String rg){
		this.rg = rg;
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
	public double getGanhoAnual(){
		return this.salario * 12;
	}

}

class Data {
	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

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
		
		System.out.println("Quantidade de funcionarios: " + Funcionario.getIdFuncionario());
	}
}