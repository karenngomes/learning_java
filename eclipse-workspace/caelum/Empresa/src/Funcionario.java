
abstract class Funcionario {
	protected String nome;
	protected double salario;
	protected String cpf;
	
	void mostraFuncionario(){
		System.out.println("Nome: " + this.nome);
		System.out.println("salario: " + this.salario);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Bonificacao: " + this.getBonificacao());
		//System.out.println("Dia: " + this.dataDeEntrada.dia);
		//System.out.println("Mês: " + this.dataDeEntrada.mes);
		//System.out.println("Ano: " + this.dataDeEntrada.ano);
	}

	public Funcionario() {
		
	}
	
	public Funcionario(String nome) {
		this();
		this.nome = nome; 
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}

	abstract double getBonificacao();
	
}
