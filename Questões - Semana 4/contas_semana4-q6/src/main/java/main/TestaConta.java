	package main;

import criar_contas.Conta;
import criar_contas.Data;

public class TestaConta {
	public static void main( String[] args ) {
		
		System.out.println("Testando Contas!\nQuestao 7 - Semana 4\n A respota está no pacote testes_junit\n");
		
		
		Conta c1 = new Conta();
        c1.setDataDeAbertura(new Data(20, 8, 2020));
        c1.recuperaDadosParaImpressao();
        
        Conta c2 = new Conta();
        c2.setDataDeAbertura(new Data(45, 8, 2020));
        c2.recuperaDadosParaImpressao();
		

		}
}