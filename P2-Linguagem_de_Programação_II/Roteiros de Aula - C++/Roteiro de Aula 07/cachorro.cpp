#include <iostream>
#include <string>

class Cachorro {
public:
    std::string nome;
    std::string raca;
    int idade;

    Cachorro(std::string n, std::string r, int i) {
        nome = n;
        raca = r;
        idade = i;
    }

    std::string latir() {
        return nome + " está latindo: Au Au!";
    }

    std::string comer(std::string comida) {
        return nome + " está comendo " + comida + ".";
    }
};

int main() {

    Cachorro cachorro1("Rex", "Labrador", 3);
    Cachorro cachorro2("Bolinha", "Poodle", 5);

    std::cout << "Nome: " << cachorro1.nome << ", Raca: " << cachorro1.raca << ", Idade: " << cachorro1.idade << " anos" << std::endl;
    std::cout << "Nome: " << cachorro2.nome << ", Raca: " << cachorro2.raca << ", Idade: " << cachorro2.idade << " anos" << std::endl;

    std::cout << cachorro1.latir() << std::endl;
    std::cout << cachorro2.comer("ração") << std::endl;

    return 0;
}