package abstractfactory;

public abstract class Carro {

    private final String modelo;
    private final String carroceria;
    private final String motor;
    private String pintura;
    private final int ano;
    private boolean ligado;
    
    public Carro(String modelo, String carroceria, String motor, String pintura, int ano) {
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.motor = motor;
        this.pintura = pintura;
        this.ano = ano;
        this.ligado = false;
    }
    
    public abstract void ligar();

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getMotor() {
        return motor;
    }

    public String getPintura() {
        return pintura;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
