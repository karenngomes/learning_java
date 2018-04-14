import java.util.Scanner;

public class SistemaInterno {
	Scanner entrada = new Scanner(System.in);
	
	void login(Autenticavel a) {
		int senha = entrada.nextInt();
		boolean ok = a.autentica(senha);
		
	}
}
