package main;

import criar_contas.Conta;

public class Main {

	public static void main( String[] args ) {
		System.out.println("Testando Contas!\n");

		//PRIMEIROS TESTES COM CONSTRUTOR COM PARAMETROS
		//Criando a Conta
		Conta contaDoZeh = new Conta();

		contaDoZeh.nome = "Zeh";
		contaDoZeh.numero = 01;
		contaDoZeh.agencia = "0800-9";
		contaDoZeh.saldo = 500;
		contaDoZeh.dataDeAbertura = "19/05/1500";

		//Exibindo conta e seus valores para conferir (não é um teste)
		System.out.println("Proprietario da conta: " + contaDoZeh.nome + "\nNumero da conta: " +
		contaDoZeh.numero + "\nNumero da agencia: " + contaDoZeh.agencia + "\nSaldo da conta: R$"
		+ contaDoZeh.saldo + "\nData de aberutra da conta: " + contaDoZeh.dataDeAbertura + "\n");

		//TESTE DE SAQUE
		contaDoZeh.sacarValor(1);
		//TESTE DE DEPOSITO
		contaDoZeh.depositarValor(100);
		//TESTE DE RENDIMENTO 
		contaDoZeh.calcularRendimento();
	}	
	
}
