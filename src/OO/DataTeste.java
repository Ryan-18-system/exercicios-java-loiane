package OO;

public class DataTeste {
    public static void main(String[] args) {
        Data dataPrimaria = new Data();
        Data dataSecundaria = new Data();
        dataPrimaria.dia = 28;
        dataPrimaria.mes = 10;
        dataPrimaria.ano = 2019;
        dataSecundaria.dia = 15;
        dataSecundaria.mes = 11;
        dataSecundaria.ano = 2019;

        System.out.println(dataPrimaria.obterDataFormatada());

    }
}
