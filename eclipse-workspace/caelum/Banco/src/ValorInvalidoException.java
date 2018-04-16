
public class ValorInvalidoException extends RuntimeException {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	ValorInvalidoException(String mensagem) {
		super(mensagem);
	}
	ValorInvalidoException(double valor) {
		super("Valor " + valor + " invalido!");
	}
}
