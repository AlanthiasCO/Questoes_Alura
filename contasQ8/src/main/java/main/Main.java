package main;

import criar_contas.Conta;

import criar_contas.Data;

public class Main {
	public static void main( String[] args ) {
		System.out.println("Testando Contas!\nQuestao 8\n");

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
		//contaData.recuperaDadosParaImpressao();
		
		//TENTANDO COLOCAR NUMEROS NEGATIVOS NA DATA
		Conta c2 = new Conta();
		c2.nome = "Homer";
		c2.numero = 13;
		c2.agencia = "1010101";
		c2.saldo = 15;
		c2.dataDeAbertura = new Data();
		c2.dataDeAbertura.criaData(-10, 5, 1800);
		
		//c2.recuperaDadosParaImpressao();
		
		//questao 8 - tentando acessar o saldo por meio de "conta.saldo"
		
		Conta c3 = new Conta();
		c3.nome = "Bart";
		c3.numero = 19;
		c3.agencia = "1919-0";
		c3.saldo = 1234;
		
		//é possivel modificar a variavel atraves de conta.variavel. Mas acessar de
		//modo que o valor arrmazenado seja mostrado, não é possivel.
		// ----> c3.saldo(s);  não retorna nada, nem pode ser compilado.
		
		c3.calcularRendimento();
		
		// ja o metodo acima devolve um valor double do rendimento conforme o saldo da conta
		// ou seja
		// c3.saldo = 1234; armazena o valor na variavel saldo
		// c3.calcularRendimento devolve o calculo da variavel saldo * 0,1
		
		
		
	}
}
