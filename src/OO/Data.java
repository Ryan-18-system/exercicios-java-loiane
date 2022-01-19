package OO;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    Data(){
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
    };
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


}
