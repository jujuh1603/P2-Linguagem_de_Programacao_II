import java.util.Scanner; 

public class nivel1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        Produto poteChocolate = new Produto("Pote Chocolate 2L", 15, 100); 

        Produto picoleLimao = new Produto("Picolé de Limão", 50, 100);

        System.out.println("Chocolate precisa repor? " + poteChocolate.verificarNecessidadeCompra());
        System.out.println("Limão precisa repor? " + picoleLimao.verificarNecessidadeCompra());

        System.out.println("--- Terminal de vendas do Dener ---");
        System.out.println("Digite a quantidade de potes vendidos: ");

        try { // [cite: 214]
            int qtdVendida = Integer.parseInt(scanner.nextLine());
            poteChocolate.registrarSaida(qtdVendida);
        } catch (NumberFormatException e) {
            System.out.println("\n[Erro de Sistema]. Operação cancelada.");
            System.out.println("Valor digitado inválido. Por favor, insira apenas números inteiros (Ex: 15).");
        } finally {
            System.out.println("[Sistema] Liberando recursos de memória...");
            scanner.close();
        }
    }
}