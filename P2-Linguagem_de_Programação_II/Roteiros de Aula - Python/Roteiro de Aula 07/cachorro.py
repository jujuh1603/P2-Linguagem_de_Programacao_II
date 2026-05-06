class Cachorro:
    def __init__(self, nome, raca, idade):
        self.nome = nome
        self.raca = raca
        self.idade = idade

    def latir(self):
        return f"{self.nome} está latindo: Au Au!"

    def comer(self, comida):
        return f"{self.nome} está comendo {comida}."

cachorro1 = Cachorro("Rex", "Labrador", 3)
cachorro2 = Cachorro("Bolinha", "Poodle", 5)

print(f"Nome: {cachorro1.nome}, Raça: {cachorro1.raca}, Idade: {cachorro1.idade} anos")
print(f"Nome: {cachorro2.nome}, Raça: {cachorro2.raca}, Idade: {cachorro2.idade} anos")

print(cachorro1.latir())
print(cachorro2.comer("ração"))