class Produto:
    def __init__(self, nome, estoque_real, estoque_ideal):
        self._nome = nome
        self._estoque_real = estoque_real
        self._estoque_ideal = estoque_ideal

    def verificar_necessidade_compra(self):
        limite_minimo = self._estoque_ideal * 0.20
        return self._estoque_real < limite_minimo

    def registrar_saida(self, quantidade):
        if quantidade <= self._estoque_real:
            self._estoque_real -= quantidade
            print(f"Venda realizada! Novo saldo de {self._nome}: {self._estoque_real}")
        else:
            print(f"ERRO: Operação Bloqueada para {self._nome}!")
            print(f"Risco de Estoque Negativo. Saldo atual: {self._estoque_real}")

pote_chocolate = Produto("Pote Chocolate 2L", 15, 100)
picole_limao = Produto("Picolé de Limão", 50, 100)

print(f"Chocolate precisa comprar? {pote_chocolate.verificar_necessidade_compra()}") 
print(f"Limão precisa comprar? {picole_limao.verificar_necessidade_compra()}")  

pote_chocolate.registrar_saida(20) 