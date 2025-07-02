package list.opbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaDeRemocao = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaDeRemocao.add(item);
            }
        }
        carrinho.removeAll(listaDeRemocao);
    }

    public double calcularValorTotal() {
        double preco = 0;
        int qtd = 0;
        double total = 0;
        for (Item i : carrinho) {
            qtd = i.getQuantidade();
            preco = i.getPreco();
            total += qtd*preco;
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 6.99, 30);
        carrinho.adicionarItem("Leite", 4.99, 15);
        carrinho.adicionarItem("Teclado Redragon Fizz k617 RGB", 199.99, 10);
        carrinho.adicionarItem("Mouse Bluetooth Logitech", 299.99, 30);

        carrinho.exibirItens();

        System.out.println("Removendo item...");
        carrinho.removerItem("Mouse Bluetooth Logitech");

        carrinho.exibirItens();

        double total = carrinho.calcularValorTotal();
        System.out.println("\nPreço total do estoque: R$"+total);
    }
}
