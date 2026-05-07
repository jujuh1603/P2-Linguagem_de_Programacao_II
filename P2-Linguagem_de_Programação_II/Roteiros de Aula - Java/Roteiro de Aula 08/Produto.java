package Roteiro de Aula 08;

public class Produto {
    private String nome;
    private int estoqueReal;
    private int estoqueIdeal;

    public Produto(String nome, int estoqueReal, int estoqueIdeal) {
        this.nome = nome;
        this.estoqueReal = estoqueReal;
        this.estoqueIdeal = estoqueIdeal;
    }

    public boolean verificarNecessidadeCompra() {
        double limiteMinimo = this.estoqueIdeal * 0.20;
        return this.estoqueReal < limiteMinimo;
    }

    public void registrarSaida(int quantidade) {
        if (quantidade <= this.estoqueReal) {
            this.estoqueReal -= quantidade;
            System.out.println("Venda realizada! Novo saldo de " + this.nome + ": " + this.estoqueReal);
        } else {
            System.out.println("ERRO: Operação Bloqueada para " + this.nome + "!");
            System.out.println("Risco de Estoque Negativo. Saldo disponível: " + this.estoqueReal);
        }
    }
}

public class SistemaEstoque {
    public static void main(String[] args) {
        Produto poteChocolate = new Produto("Pote Chocolate 2L", 15, 100);
        Produto picoleLimao = new Produto("Picolé de Limão", 50, 100);

        System.out.println("Chocolate precisa repor? " + poteChocolate.verificarNecessidadeCompra());
        System.out.println("Limão precisa repor? " + picoleLimao.verificarNecessidadeCompra());

        poteChocolate.registrarSaida(20);
    }
}