class Insumo:
    def __init__(self, nome, quantidade, mes_validade):
        self.__nome = nome
        self.__quantidade = quantidade
        self.__mes_validade = None 
        self.set_mes_validade(mes_validade)

    def set_mes_validade(self, mes):
        if 1 <= mes <= 12:
            self.__mes_validade = mes
        else:
            print(f"ERRO: Mês de validade ({mes}) inválido. O valor deve estar entre 1 e 12.")

    def esta_valido(self, mes_atual):
        if self.__mes_validade is not None and self.__mes_validade < mes_atual:
            print("ALERTA: Risco de Amendoim Murcho! Produto Vencido")
            return False
        return True

amendoim = Insumo("Amendoim Granulado", 50, 10)

amendoim.set_mes_validade(15) 

status = amendoim.esta_valido(11) 
print(f"O produto está válido? {status}")