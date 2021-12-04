package heranca;

public class Aluno extends Pessoa {
    private String[] curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String telefoneCelular, String name, String endereco, String[] curso) {
        super(telefoneCelular, name, endereco);
        this.curso = curso;
    }

    public String[] getCurso() {
        return curso;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){

        return 0;
    }

    public boolean verificarAprovado(){

        return false;
    }
    public String getEndereco() {
        String retorno = "Endereço do aluno: ";
        retorno += super.getEndereco();
        return retorno;
    }
}
