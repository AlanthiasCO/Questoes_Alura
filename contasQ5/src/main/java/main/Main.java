package main;

import criar_contas.Conta;

public class Main {

	public static void main( String[] args ) {
		System.out.println("Testando Contas!\nQuestao 5\n");

		//PRIMEIROS TESTES COM CONSTRUTOR COM PARAMETROS
		//Criando a Conta
		Conta contaDoZeh = new Conta();

		contaDoZeh.nome = "Zeh";
		contaDoZeh.numero = 01;
		contaDoZeh.agencia = "0800-9";
		contaDoZeh.saldo = 500;
		contaDoZeh.dataDeAbertura = "19/05/1500";

		//Exibindo conta e seus valores para conferir (não é um teste)
		//System.out.println("Proprietario da conta: " + contaDoZeh.nome + "\nNumero da conta: " +
		//contaDoZeh.numero + "\nNumero da agencia: " + contaDoZeh.agencia + "\nSaldo da conta: R$"
		//+ contaDoZeh.saldo + "\nData de aberutra da conta: " + contaDoZeh.dataDeAbertura + "\n");

		//TESTE DE SAQUE
		//contaDoZeh.sacarValor(1);
		//TESTE DE DEPOSITO
		//contaDoZeh.depositarValor(100);
		//TESTE DE RENDIMENTO 
		//contaDoZeh.calcularRendimento();
		
		//TESTANDO O METODO recuperaDadosParaImpressao()
		//contaDoZeh.recuperaDadosParaImpressao();
		
		Conta c1 = new Conta();
		c1.nome = "Murilo";
		c1.numero = 02;
		c1.agencia = "0800-8";
		c1.saldo = 10;
		c1.dataDeAbertura = "18/05/2000";
		
		Conta c2 = new Conta();
		c2.nome = "Murilo";
		c2.numero = 02;
		c2.agencia = "0800-8";
		c2.saldo = 10;
		c2.dataDeAbertura = "18/05/2000";
		
		c1.recuperaDadosParaImpressao();
		c2.recuperaDadosParaImpressao();
		
		
		//IGUALANDO AS VARIAVEIS, CONFORME A QUESTAO 5 PEDE
		c1 = c2;
		// COMPARANDO AS VARIAVEIS
		if(c1 == c2) {
			System.out.println("iguais");
	    } else {
	        System.out.println("diferentes");   
			}
		//AGORA AS VARIAVEIS SÃO APONTAM PARA O MESMO OBJETO, POR ISSO O RESULTADO FOI "IGUAIS"
		// SE MUDAR ALGO NA C1, MUDARÁ NA C2 TAMBÉM
		 
		
	}
}
