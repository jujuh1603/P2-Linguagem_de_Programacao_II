print("--- Auditoria de Estoque ---") 
try: 
    with open("estoque_dener.txt", "r") as arquivo:
        dados = arquivo.read()
        print("Estoque carregado com sucesso:") 
        print(dados) 
except FileNotFoundError: 
    print("[ALERTA] Base de dados não encontrada.") 
    print("[SISTEMA] Inicializando um novo arquivo de estoque zerado...") 
    with open("estoque_dener.txt", "w") as arquivo:
        arquivo.write("--- REGISTRO DE ESTOQUE DA SORVETERIA ---\n")
    print("[SISTEMA] Novo arquivo criado. O inventário está vazio.") 