package criar_contas;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
		
	public void criaData(int dia, int mes, int ano) {
	if(this.dia < 0 || this.mes < 0) {
		System.out.println("Digite um numero positivo!");
	} else if (this.mes < 0) {
		System.out.println("Digite um numero positivo!");
	} else {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	}
	
}


