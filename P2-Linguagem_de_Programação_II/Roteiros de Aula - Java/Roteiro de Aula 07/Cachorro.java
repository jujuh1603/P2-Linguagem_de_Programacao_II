public class Cachorro {
    String nome;
    int idade;
    String raca;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String latir() {
        return nome + " está latindo: Au Au!";
    }

    public String comer(String comida) {
        return nome + " está comendo " + comida + ".";
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Labrador", 3);
        Cachorro cachorro2 = new Cachorro("Bolinha", "Poodle", 5);

        System.out.println("Nome: " + cachorro1.nome + ", Raca: " + cachorro1.raca + ", Idade: " + cachorro1.idade + " anos");
        System.out.println("Nome: " + cachorro2.nome + ", Raca: " + cachorro2.raca + ", Idade: " + cachorro2.idade + " anos");

        System.out.println(cachorro1.latir());
        System.out.println(cachorro2.comer("ração"));
    }
}