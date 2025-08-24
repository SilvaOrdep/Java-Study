package exception;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Order {
    String id; int qty; BigDecimal price;
    Order(String id, int qty, BigDecimal price) { this.id = id; this.qty = qty; this.price = price; }

    @Override
    public String toString() {
        return "Order: id("+id+") qtd("+qty+") price("+price+") ";
    }
}

class InvalidStringFormat extends Exception {

    public InvalidStringFormat(String message) {
        super(message);
    }

}

public class Q02 {
    /**
     * Cada linha no formato: ID;QTY;PRICE
     * Ex.: "A1;3;19.90"
     * Requisitos:
     * - Converter com tratamento de NumberFormatException e campos faltantes.
     * - Em erro, registrar mensagem de erro em errorLog e continuar.
     * - Retornar somente pedidos válidos.
     */
    static List<Order> parseOrders(List<String> lines, List<String> errorLog) {

        List<Order> orders = new ArrayList<>();

        for(String line : lines) {
            try {
                orders.add(parseOrder(line));
            } catch (InvalidStringFormat e) {
                System.err.println("Formatação de string inválida para conversão: " + e.getMessage());
                errorLog.add("Linha errada : " + line + " / erro : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Erro número com formato inválido: " + e.getMessage());
                errorLog.add("Linha errada : " + line + " / erro: " + e.getMessage());
            }
        }

        return orders;
    }

    static Order parseOrder(String line) throws InvalidStringFormat {
        String[] attributes = line.split(";");

        if(attributes.length != 3) throw new InvalidStringFormat("String não contém os 3 campos obrigatórios");
        String id = attributes[0];
        int qtd = Integer.parseInt(attributes[1]);
        BigDecimal price = BigDecimal.valueOf(Double.parseDouble(attributes[2]));

        return new Order(id,qtd,price);
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("A1;10;10.3", "A2;10.2", "A3;F;E", "A4;20;D", "A5;23;15.50");
        List<String> errorLog = new ArrayList<>();
        List<Order> orders = parseOrders(lines, errorLog);

        System.out.println(orders);
        System.out.println(errorLog);
    }
}
