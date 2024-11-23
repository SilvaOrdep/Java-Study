package estoque;
import java.util.Scanner;
public class RoupaPMG implements Item{

    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;



    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidadeP() {
        return quantidadeP;
    }
    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }
    public int getQuantidadeM() {
        return quantidadeM;
    }
    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }
    public int getQuantidadeG() {
        return quantidadeG;
    }
    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }
    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }
    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
                    int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void reposicaoEstoque(){
        if(this.quantidadeP< this.estoqueMinimo){
            this.quantidadeP = this.estoqueMaximo;
        }
        if(this.quantidadeM < this.estoqueMinimo){
            this.quantidadeM = this.estoqueMaximo;
        }
        if(this.quantidadeG < this.estoqueMinimo){
            this.quantidadeG = this.estoqueMaximo;
        }
    }




    public void venda() {

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Qual o tamanho do item?");
            String tam = sc.next().toUpperCase();

            switch (tam) {
                case "P":
                    this.quantidadeP--;
                    System.out.println("Quantidade:"+this.quantidadeP);


                    break;
                case "M":
                    this.quantidadeM--;
                    System.out.println("Quantidade:"+this.quantidadeM);

                    break;
                case "G":
                    this.quantidadeG--;
                    System.out.println("Quantidade:"+this.quantidadeG);

                    break;
                default:
                    System.err.println("Tamanho inexistente");
                    break;
            }
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
        System.out.println("Quantidade P: " + this.getQuantidadeP());
        System.out.println("Quantidade M: " + this.getQuantidadeM());
        System.out.println("Quantidade G: " + this.getQuantidadeG());
        System.out.println("Estoque mínimo: " + this.getEstoqueMinimo());
        System.out.println("Estoque máximo: " + this.getEstoqueMaximo()+"\n");
    }
}


