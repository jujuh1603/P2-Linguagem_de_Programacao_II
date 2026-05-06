package Roteiro de Aula 07;

public public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String abrir() {
        return "O livro '" + titulo + "' foi aberto.";
    }

    public String lerPagina() {
        return "Lendo uma página do livro de " + autor + "...";
    }

    public String fechar() {
        return "O livro '" + titulo + "' foi fechado.";
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        System.out.println(livro1.abrir());
        System.out.println(livro2.lerPagina());
        System.out.println(livro3.fechar());
    }
} 
    

