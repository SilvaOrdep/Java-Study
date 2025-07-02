package GetAndSetFundamento;

public class Carro {
    // Getters e Setters são basicamente metodos para pegar ou modificar os atributos de um determinado objeto
    // é possível "invoca-los" através do generate da IDE em "Generate/ Getter and Setter"

    private String marca, modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
