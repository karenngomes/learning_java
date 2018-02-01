class Funcionario {
	protected String nome;
	String departamento;
	protected double salario;
	Data dataDeEntrada;
	protected String cpf;
	boolean estaNaEmpresa;
	int identificador;

	void mostraFuncionario(){
		System.out.println("Nome: " + this.nome);
		System.out.println("departamento: " + this.departamento);
		System.out.println("salario: " + this.salario);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Está na empresa? " + this.estaNaEmpresa);
		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
		//System.out.println("Dia: " + this.dataDeEntrada.dia);
		//System.out.println("Mês: " + this.dataDeEntrada.mes);
		//System.out.println("Ano: " + this.dataDeEntrada.ano);
	}

	public Funcionario(){
		this.identificador = this.identificador + 1;
	}

	public Funcionario(String nome) {
		this();
		this.nome = nome; 
	}

	public Funcionario(Data dataInicio, String nomeFunc) {
		this(nomeFunc);
		this.dataDeEntrada = dataInicio;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdFuncionario() {
		return this.identificador;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public String getCpf(){
		return this.cpf;
	}

	public void setcpf(String cpf){
		this.cpf = cpf;
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

	public double getBonificacao() {
		return this.salario * 0.10;
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