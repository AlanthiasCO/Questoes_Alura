package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import criar_contas.Conta;

class testes_contas {

	@Test
	public void testSaqueAcimaDoSaldo() {
		Conta conta01 = new Conta();

		conta01.nome = "Marcos";
		conta01.numero = 02;
		conta01.agencia = "0800-9";
		conta01.saldo = 0;
		conta01.dataDeAbertura = "16/03/1600";

		//EXECUTANDO SAQUE
		conta01.sacarValor(5);

		//TESTE - Saque não é possivel
		assertEquals(0, conta01.getSaldo());
	}

	@Test
	public void testeDepositoESaque() {
		
		Conta conta01 = new Conta();

		conta01.nome = "Marcos";
		conta01.numero = 02;
		conta01.agencia = "0800-9";
		conta01.saldo = 0;
		conta01.dataDeAbertura = "16/03/1600";

		//EXECUTANDO O DEPOSITO
		conta01.depositarValor(500);

		//TESTE - Deposito de 500 efetuado
		assertEquals(500, conta01.getSaldo());

		//EXECUTANDO O SAQUE 
		conta01.sacarValor(200);

		//TESTE - Saque realizado em um saldo de 500 -> 500 - 200 = 300
		assertEquals(300, conta01.getSaldo());
	}

	@Test 
	public void testeDepositoNegativo() {
		Conta conta01 = new Conta();

		conta01.nome = "Marcos";
		conta01.numero = 02;
		conta01.agencia = "0800-9";
		conta01.saldo = 0;
		conta01.dataDeAbertura = "16/03/1600";

		conta01.depositarValor(-5);

		assertEquals(0, conta01.getSaldo());
	}

	@Test 
	public void testeSaqueNegativo() {
		Conta conta01 = new Conta();

		conta01.nome = "Marcos";
		conta01.numero = 02;
		conta01.agencia = "0800-9";
		conta01.saldo = 0;
		conta01.dataDeAbertura = "16/03/1600";

		conta01.sacarValor(-5);

		assertEquals(0, conta01.getSaldo());
	}
	
}