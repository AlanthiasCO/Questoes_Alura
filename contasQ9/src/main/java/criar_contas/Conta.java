package criar_contas;

public class Conta {
	public String nome;
	public int numero;
	public String agencia;
	public double saldo;
	public Data dataDeAbertura;

	//Construtor com Parametros (apenas para treinar)
	public Conta(String nome, int numero, String agencia, double saldo, Data dataDeAbertura) {
		
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}
	//CONSTRUTOR SEM PARAMETROS
	public Conta() {

	}
	
	public void sacarValor(double valor){
	if(valor > saldo) {
		System.out.println("Saque nao realizado. Saldo insuficiente!\n");
	} else if (valor < 0){
		System.out.println("Saque nao realizado. Digite um valor positivo!\n");
	} else {
		this.saldo -= valor;
		System.out.println("Saque realizado. Saldo atual: R$" + saldo +"\n");
		}
	}

	public void depositarValor(double valor) {
	if(valor < 0) {
		System.out.println("Deposito nao realizado. Digite um valor postivo.\n");
	}else {
		this.saldo += valor;
		System.out.println("Deposito realizado. Saldo atual: R$" + saldo + "\n" );
		}
	}

	public void calcularRendimento(){
	if(this.saldo == 0 && this.saldo < 0) {
		System.out.println("Nao eh possivel realizar o calculo de rendimento com o seguinte valor: R$" + saldo);
	} else {
		System.out.println("Rendimento mensal: R$" + String.format("%.2f", this.saldo * 0.1));
		}
	}


	// GETTERS PARA VALIDAR TESTES
	public double getSaldo() {
		return saldo;
	}
	
	public void recuperaDadosParaImpressao() {
		System.out.println("Nome do titular: " + this.nome);
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Agencia da conta: " + this.agencia);
		System.out.println("Saldo da conta: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.dataDeAbertura.formataData());
	}
	
}
