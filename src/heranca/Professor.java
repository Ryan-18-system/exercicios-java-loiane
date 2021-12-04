package heranca;

public class Professor extends  Pessoa {
    private double salario;
    private String nomeCurso;

    public Professor() {
        super();
    }

    public Professor(String telefoneCelular, String name, String endereco, String nomeCurso) {
        super(telefoneCelular, name, endereco);
        this.nomeCurso = nomeCurso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public double calcularSalarioLiquido(){
        return 0;
    }
    public String getEndereco() {
        String retorno = "Endereço do professor: ";
        retorno += super.getEndereco();
        return retorno;
    }

}
