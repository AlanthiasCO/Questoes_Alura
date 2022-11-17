package banco;

public class Conta {
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;

	public Conta() {}
	
	//QUESTÃO 1 E 3
	public void depositarValor(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Nao eh possivel realizar depositos com valores menores que 0 (zero)");
		}else {
			this.saldo += valor;
			System.out.println("Deposito realizado. Saldo atual: R$" + saldo + "\n" );
			}
		}
	
	//QUESTÃO 4
	public void sacarValor(double valor){
	if(valor > saldo) {
		throw new SaldoInsuficienteException(saldo);
	} else if (valor < 0){
		throw new IllegalArgumentException("Saque nao realizado. Digite um valor positivo!\n");
	} else 
		this.saldo -= valor;
		System.out.println("Saque realizado. Saldo atual: R$" + saldo +"\n");
		}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	
	
	
	
	
	
}


