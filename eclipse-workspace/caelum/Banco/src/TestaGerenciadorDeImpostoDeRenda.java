
public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		ContaCorrente cc = new ContaCorrente();
		
		gerenciador.adiciona(sv);
		cc.deposita(1000);
		System.out.printf("O saldo é: %.2f\n", cc.getSaldo());
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
		
	}

}
