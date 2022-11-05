package main;

import criar_contas.Conta;

import criar_contas.Data;

public class Main {
	public static void main( String[] args ) {
		System.out.println("Testando Contas!\nQuestao 9\n");

		Conta c9 = new Conta();
		
		c9.nome = "Morrow";
		c9.numero = 13;
		c9.agencia = "1515-80";
		c9.saldo = 2020;
		c9.dataDeAbertura = new Data();
		c9.dataDeAbertura.criaData(10, 05, 2002);
		
		c9.recuperaDadosParaImpressao();
		
	}
}
