class EmpregoDaFaculdade {
	private String nome;
	private double salario;

	double getGastos() {
		return this.salario;
	}

	String getInfo() {
		return "Nome: " + this.nome + " com salário " + this.salario;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setSalario(double salario) {
		this.salario = salario;
	}

	double getSalario() {
		return this.salario;
	}

}

class ProfessorDaFaculdade extends EmpregoDaFaculdade {
	private int horasDeAula;

	double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}

	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		return informacao;
	}

	int getHorasDeAula() {
		return this.horasDeAula;
	}

	void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

}

class Reitor extends EmpregoDaFaculdade {
	String getInfo() {
		return super.getInfo() + "e ele é um reitor.";
	}
}

class GeradorDeRelatorio {
	public void adiciona(EmpregoDaFaculdade f) {
		System.out.println(f.getInfo());
		System.out.println(f.getGastos());
	}
}

class TestaFaculdade {
	public static void main(String[] args) {
		EmpregoDaFaculdade f1 = new EmpregoDaFaculdade();
		f1.setNome("Ana");
		f1.setSalario(1000);

		ProfessorDaFaculdade p1 = new ProfessorDaFaculdade();
		p1.setNome("Paes");
		p1.setHorasDeAula(20);
		p1.setSalario(3000);

		Reitor r1 = new Reitor();
		r1.setNome("Regina");
		r1.setSalario(10000);

		GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
		relatorio.adiciona(f1);
		relatorio.adiciona(p1);
		relatorio.adiciona(r1);


	}
}