public class Insumo {
    private String nome;
    private int quantidade;
    private int mesValidade;

    public Insumo(String nome, int quantidade, int mesValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        setMesValidade(mesValidade); 
    }

    public void setMesValidade(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mesValidade = mes;
        } else {
            System.out.println("ERRO: Mês de validade (" + mes + ") inválido. A validade não foi alterada.");
        }
    }

    public boolean estaValido(int mesAtual) {
        if (this.mesValidade < mesAtual) {
            System.out.println("ALERTA: Risco de Amendoim Murcho! Produto Vencido");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Insumo amendoim = new Insumo("Amendoim Granulado", 50, 10);
        
        amendoim.setMesValidade(15);

        boolean valido = amendoim.estaValido(11);
        System.out.println("O produto está válido? " + valido);
    }
}