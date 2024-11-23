package aplicacao;

import estoque.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Item itens [] = new Item[5];
        int opc;
        itens[0] = new RoupaPMG("Camisa", 5, 1, 4, 1, 10);
        itens[1] = new RoupaTamanhoUnico("Saia", 2, 1, 10);
        itens[2] = new Acessorio("Cinto", 5, 1, 4);
        itens[3] = new Acessorio("Pulseira", 3, 1, 10);
        itens[4] = new RoupaPMG("Saída de praia", 5, 1, 4, 1, 10);
        RoupaPMG camisa = (RoupaPMG) itens[0];
        RoupaTamanhoUnico saia = (RoupaTamanhoUnico) itens[1];
        Acessorio cinto = (Acessorio) itens[2];
        Acessorio pulseira = (Acessorio) itens[3];
        RoupaPMG saidaDePraia = (RoupaPMG) itens[4];

        try(Scanner sc = new Scanner(System.in)){
            do {
                System.out.println("Menu de stock");
                System.out.println("0 – Camisa");
                System.out.println("1 – Saia");
                System.out.println("2 – Cinto");
                System.out.println("3 – Pulseira");
                System.out.println("4 – Saída de praia");
                System.out.println("5 - Mostrar dados do estoque");
                System.out.println("6 – Sair do sistema");
                opc = sc.nextInt();

                switch(opc){
                    case 0:
                        camisa.processamento();
                        mensagemDeVendaFeita(camisa.getDescricao());
                        break;
                    case 1:
                        saia.processamento();
                        mensagemDeVendaFeita(saia.getDescricao());
                        break;
                    case 2:
                        cinto.processamento();
                        mensagemDeVendaFeita(cinto.getDescricao());
                        break;
                    case 3:
                        pulseira.processamento();
                        mensagemDeVendaFeita(pulseira.getDescricao());
                        break;
                    case 4:
                        saidaDePraia.processamento();
                        mensagemDeVendaFeita(saidaDePraia.getDescricao());
                        break;
                    case 5:
                        for (Item item : itens) {
                            item.mostrarDados();
                        }
                        break;
                    case 6:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
            } while (opc != 6);
        }
    }

    public static void mensagemDeVendaFeita(String descricao){
        System.out.println("Venda de "+descricao+" realizada com sucesso!");
    }

}
