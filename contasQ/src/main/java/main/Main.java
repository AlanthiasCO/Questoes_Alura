package main;

import criar_contas.Conta;

import criar_contas.Data;

public class Main {
	public static void main( String[] args ) {
		System.out.println("Testando Contas!\nQuestao 6\n");

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
		
		//TODO: CRIAR UMA IMPRESSAO MELORAR PARA A DATA
		
		
		
	}
}
