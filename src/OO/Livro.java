package OO;
import java.util.*;
public class Livro {
    String nomeDoLivro;
    String genero;
    String autor;
    int qntPaginas;
    String editora;
    HashMap<String,Double> dimensoes = new HashMap<String, Double>();

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setDimensoes(Double altura, Double largura, Double comprimento) {
        dimensoes.put("altura", altura);
        dimensoes.put("largura", largura);
        dimensoes.put("comprimento", comprimento);
    }
   public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public HashMap<String, Double> getDimensoes() {
        return dimensoes;
    }


    public static  void main(String[] args){
        Livro livro = new Livro();
        livro.setNomeDoLivro("Shell Linux");
        livro.setAutor(" Tales Araujo Mendonça");
        livro.setGenero("Computação");
        livro.setEditora("Viena");
        livro.setQntPaginas(368);
        livro.setDimensoes( 23.0,16.0, 1.9);
        for (String dicionario:
             livro.getDimensoes().keySet()) {
            System.out.println(dicionario + " " + livro.dimensoes.get(dicionario));
        }
    }
}
