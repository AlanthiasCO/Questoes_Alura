package main;

import criar_contas.Conta;

import criar_contas.Data;

public class Main {
	public static void main( String[] args ) {
		System.out.println("Testando Contas!\nQuestao 7\n");

		Conta contaData = new Conta();
		//CRIANDO COM O CONSTRUTOR DE "CONTA"
		contaData.nome = "Louis";
		contaData.numero = 14;
		contaData.agencia = "0800-7";
		contaData.saldo = 10;
		//CRIANDO A DATA COM O CONSTRUTOR "DATA"
		contaData.dataDeAbertura = new Data();
		contaData.dataDeAbertura.criaData(14, 8, 1924);
		
		//VERIFICANDO DADOS 
		contaData.recuperaDadosParaImpressao();
		
		//TENTANDO COLOCAR NUMEROS NEGATIVOS NA DATA
		Conta c2 = new Conta();
		c2.nome = "Homer";
		c2.numero = 13;
		c2.agencia = "1010101";
		c2.saldo = 15;
		c2.dataDeAbertura = new Data();
		c2.dataDeAbertura.criaData(-10, 5, 1800);
		
		c2.recuperaDadosParaImpressao();

		
		
	}
}
