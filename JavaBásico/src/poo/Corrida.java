package poo;

import java.util.Objects;

public class Corrida {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo();
        Veiculo celta = new Veiculo();
        int distanciaFinal = 10;
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println(uno.getDistanciaPercorrida() + "U");
            System.out.println(celta.getDistanciaPercorrida() + "C");
            uno.mover();
            celta.mover();
        } while (distanciaFinal > uno.getDistancia() || distanciaFinal > celta.getDistancia());

        System.out.println("---------------------------------------------------------------");
        System.out.println(uno.getDistanciaPercorrida() + "U");
        System.out.println(celta.getDistanciaPercorrida() + "C");

        if ((uno.getDistancia() >= distanciaFinal) && (celta.getDistancia() < uno.getDistancia())) {
            System.out.println("O Uno venceu!"+ " uno dis: "+uno.getDistancia()+" celta dis: "+celta.getDistancia());
        } else if ((Objects.equals(celta.getDistanciaPercorrida(), uno.getDistanciaPercorrida())) && (celta.getDistancia() == uno.getDistancia())) {
            System.out.println("Empate!"+ " uno dis: "+uno.getDistancia()+" celta dis: "+celta.getDistancia());
        } else if (celta.getDistancia() >= distanciaFinal && celta.getDistancia() > uno.getDistancia()) {
            System.out.println("O Celta venceu!"+ " uno dis: "+uno.getDistancia()+" celta dis: "+celta.getDistancia());
        }
    }
}
