package enums;

public class SistemaTesteDeEnum {
    public static void main(String[] args) {
        //percorrer um enum:
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro seuEstado = EstadoBrasileiro.BAHIA; // enum de representação de estado brasileiro
        System.out.println("Seu estado: "+seuEstado.getSigla()+ " - " + seuEstado.getNomeUpper());
    }
}
