import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class nivel3 { 
    public static void main(String[] args) { 
        System.out.println("--- Terminal de Auditoria: Sorveteria do Dener ---"); 
        System.out.println("[SISTEMA] Tentando carregar banco de dados de estoque..."); 

        try { 
            FileReader leitorArquivo = new FileReader("estoque_dener.txt"); 
            BufferedReader buffer = new BufferedReader(leitorArquivo); 

            System.out.println("\n--- ITENS EM ESTOQUE ---"); 
            String linha; 

            while ((linha = buffer.readLine()) != null) { 
                System.out.println(linha); 
            }
            buffer.close(); 

        } catch (IOException e) { 
            System.err.println("\n[ERRO CRÍTICO] O sistema interrompeu a execução.");
            e.printStackTrace(); 
        }

        System.out.println("\n[LOG] Fim da rotina de auditoria."); 
    }
}
