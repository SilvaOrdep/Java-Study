package poo;
import java.util.Random;
public class Veiculo {
    Random v = new Random();
    private int velocidade;
    private int distancia;
    private String distanciaPercorrida;
    public Veiculo() {
        this.velocidade = 0;
        this.distancia = 0;
        this.distanciaPercorrida = "";
    }
    public void mover() {
        this.velocidade = v.nextInt(1, 4);
        this.distancia += this.velocidade;
        for (int i = 0; i < this.velocidade; i++) {
            this.distanciaPercorrida += " ";
        }
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public String getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public void setDistanciaPercorrida(String distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
}
    
