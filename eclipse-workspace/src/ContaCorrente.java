
public class ContaCorrente extends Conta{
	@Override
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		super.atualiza(taxa * 2) ;
	}
}
