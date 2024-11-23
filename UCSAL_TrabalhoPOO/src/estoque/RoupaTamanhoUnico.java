package estoque;
public class RoupaTamanhoUnico extends Peca implements Item{
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }
    @Override
    public void venda() {
        this.setQuantidade(this.getQuantidade() - 1 );
        System.out.println("Unidade vendida!");
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
