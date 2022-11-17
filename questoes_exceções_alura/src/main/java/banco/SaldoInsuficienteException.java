package banco;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double saldo) {
		super("Saldo insuficiente. O saldo da conta eh: R$" +	saldo);	
		}

}
