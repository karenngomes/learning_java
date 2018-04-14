
public class Diretor extends Funcionario implements Autenticavel {
	private int senha;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return this.salario * 1.4 + 1000;
	}
	
	public boolean autentica(int senha) {
		if(this.senha != senha)
			return false;
		
		System.out.println("Autenticação feita com sucesso!");
		return true;
		
	}
}
