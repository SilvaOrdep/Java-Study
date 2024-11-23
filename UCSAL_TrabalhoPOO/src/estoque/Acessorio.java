package estoque;
import java.util.Scanner;
public class Acessorio extends Peca implements Item{
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }
    @Override
    public void venda() {
        try(Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite a quantidade vendida do acessório:");
            int vendidos = scan.nextInt();

            this.setQuantidade(this.getQuantidade() - vendidos);
        }

    }

    @Override
    public void processamento() {
        this.venda();
        this.reposicaoEstoque();
    }

    @Override
    public void mostrarDados() {
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Estoque mínimo: " + this.getEstoqueMinimo());
        System.out.println("Estoque máximo: " + this.getEstoqueMaximo()+"\n");
    }
}
