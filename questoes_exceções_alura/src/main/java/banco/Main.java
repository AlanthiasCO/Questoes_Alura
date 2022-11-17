package banco;

public class Main {

	 public static void main( String[] args )
	    {
		 
		 
		 Conta conta01 = new Conta();
		 
		 //conta01.depositarValor(-100);
		 
		 /*
		  * QUESTÃO 2:
		IllegalArgumentException é printado	 quando	 tentar	 depositar	 um	 valor negativo
		o próprio método depositarValor previne o erro.
		 
		 */
		 
		 
		 //QUESTÃO 4 (TIRAR OS COMENTARIOS PARA FUNCIONAR)
		 conta01.depositarValor(100); 
		 conta01.sacarValor(200); //sacar mais do que o valor total
		 
		 //conta01.sacarValor(-10); //sacar valor negativo
		 
	    }
	    
	
}
