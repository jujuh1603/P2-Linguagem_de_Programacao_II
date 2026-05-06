#include <iostream>
#include <string>

class Livro {
public:
    std::string titulo;
    std::string autor;
    int anoPublicacao;

    Livro(std::string t, std::string a, int ano) {
        titulo = t;
        autor = a;
        anoPublicacao = ano;
    }

    std::string abrir() {
        return "O livro '" + titulo + "' foi aberto.";
    }

    std::string lerPagina() {
        return "Lendo uma página do livro de " + autor + "...";
    }

    std::string fechar() {
        return "O livro '" + titulo + "' foi fechado.";
    }
};

int main() {
    Livro livro1("1984", "George Orwell", 1949);
    Livro livro2("Dom Quixote", "Miguel de Cervantes", 1605);
    Livro livro3("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

    std::cout << livro1.abrir() << std::endl;
    std::cout << livro2.lerPagina() << std::endl;
    std::cout << livro3.fechar() << std::endl;

    return 0;
}