
class Gerente extends Funcionario {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return this.salario * 1.4 + 1000;
	}

}
