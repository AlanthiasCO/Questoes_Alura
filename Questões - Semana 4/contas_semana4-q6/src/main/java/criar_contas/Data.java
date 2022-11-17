package criar_contas;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	
	
	public Data() {}
	
	//construtor
	public Data(int dia, int mes, int ano) {
        this.preencheData(dia, mes, ano); //metodo
    }

	//invocado pelo metodo
    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { //exceções = mes 4, 6, 9 e 11 que não tem dia 31
            ultimoDiaDoMes = 30; //nesses casos de exceções, o mes vai ate dia 30
        } else if (mes == 2) { //outra excessão, mes 2
            if (ano % 4 == 0) { //considerando os anos bissextos | se der resto igual a 0 signifca que é bissexto
                ultimoDiaDoMes = 29; //caso  seja bissexto = ultimo dia = 29 
            } else {
                ultimoDiaDoMes = 28; //caso nao seja bissexto = ultima dia = 28
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }

    //metodo para preencher a data
    void preencheData(int dia, int mes, int ano) {
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("\nA data " + dia + "/" + mes + "/" + ano + " não existe!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }  
    }
    
    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    
}


