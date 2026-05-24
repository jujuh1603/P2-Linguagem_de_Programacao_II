try: 
    with open("vendas.txt", "a") as banco_dados: 
        banco_dados.write("Venda: Pote Chocolate\n") 
        print("Dados persistidos com sucesso.") 
except IOError: 
    print("Erro crítico: Não foi possível acessar o disco.") 
finally: 
    print("[SISTEMA] Rotina de I/O finalizada. Recursos liberados.") 