package relacionamento;
import java.util.Scanner;
public class ProgramaPrincipal {
    public static  void main(String[] ags){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da sua agenda: ");
        String nomeAgenda = scan.next();
        Agenda agenda1 = new Agenda(nomeAgenda);

        // criando um array de objetos
        Contato[] contatos = new Contato[3];
        // Gerando os 3 contatos atraves do for e setando os valores
        for(int i=0; i<3; i++){
            System.out.println("Digite as informações do contato: "+ (i+1));
            Contato c = new Contato();
            System.out.println("Entre com o nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);
            System.out.println("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);
            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            contatos[i] = c;
        }
        agenda1.setContatos(contatos);
        if (agenda1 != null){
            System.out.println((agenda1.obterInfo()));
        }



    }
}
