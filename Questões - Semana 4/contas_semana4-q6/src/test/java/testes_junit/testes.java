package testes_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import criar_contas.Cliente;
import criar_contas.Conta;
import criar_contas.Data;

public class testes {

	@Test
	public void testandoQ7() {
			
		
		Conta c1 = new Conta();
		c1.setDataDeAbertura(new Data(40, 05, 2015));  // não pode passar
		
		
		assertEquals(c1.getDataDeAbertura(), 0/0/0);
		
				
				

		
	}
	
}