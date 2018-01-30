
public class TestaArray {

	public static void main(String[] args) {
		Conta[] minhasContas = new Conta[10];

		Conta contaNova = new Conta();
		contaNova.saldo = 1000.0;
		minhasContas[0] = contaNova;

		minhasContas[1] = new Conta();
		minhasContas[1].saldo = 3200.0;

		System.out.println(minhasContas[1].saldo);

		int[] idades = new int[10];

		for (int i = 0; i < 10; i++) {
			idades[i] = (i + 1) * 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(idades[i]);
		}

		imprimeArray(idades);

	}
	
	public static void imprimeArray(int[] array) {
		for (int x : array) {
			x++;
			System.out.println(x);
		}
	}

}