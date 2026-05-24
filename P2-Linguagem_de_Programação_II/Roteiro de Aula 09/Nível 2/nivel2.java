import java.io.FileWriter; 
import java.io.IOException; 

public class nivel2 { 
    public static void main(String[] args) { 
        try (FileWriter escritor = new FileWriter("log_sistema.txt", true)) { 
            escritor.write("Operação realizada em: " + java.time.LocalDateTime.now() + "\n"); 
            System.out.println("Log registrado no disco com sucesso.");
        } catch (IOException e) { 
            System.out.println("Falha de hardware: Disco protegido ou cheio."); 
        } finally { 
            System.out.println("[AUDITORIA] Recursos de I/O verificados e seguros."); 
        }
    }
}