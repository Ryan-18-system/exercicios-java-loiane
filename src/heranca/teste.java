package heranca;

public class teste {
     public static void main(String[] args){
         Pessoa aluno = new Aluno();
         Pessoa professor = new Professor();
         Pessoa pessoa = new Pessoa();
         aluno.setEndereco("Rua francisco florêncio da costa");
         professor.setEndereco("Rua deputado Alvaro Gaudencio");
         pessoa.setEndereco("Valentina");
         System.out.println(aluno.getEndereco());
         System.out.println(professor.getEndereco());
         System.out.println(pessoa.getEndereco());
     }
}
