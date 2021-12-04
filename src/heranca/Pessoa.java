package heranca;

public class Pessoa {
    private String name;
    private  String cpf;
    private String telefone;
    protected String endereco;
    private String telefoneCelular;

    public Pessoa() {
        super();
    }

    public Pessoa(String telefoneCelular, String name, String endereco) {
        this.telefoneCelular = telefoneCelular;
        this.name = name;
        this.endereco = endereco;
    }

    public String getTelefoneCelular() {

        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {

        this.telefoneCelular = telefoneCelular;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {


        this.name = name;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
