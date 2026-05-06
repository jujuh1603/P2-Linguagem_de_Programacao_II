class Livro:
    def __init__(self, titulo, autor, ano_publicacao):
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao

    def abrir(self):
        return f"O livro '{self.titulo}' foi aberto."

    def ler_pagina(self):
        return f"Lendo uma página do livro de {self.autor}..."

    def fechar(self):
        return f"O livro '{self.titulo}' foi fechado."

livro1 = Livro("1984", "George Orwell", 1949)
livro2 = Livro("Dom Quixote", "Miguel de Cervantes", 1605)
livro3 = Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954)

print(livro1.abrir())
print(livro2.ler_pagina())
print(livro3.fechar())