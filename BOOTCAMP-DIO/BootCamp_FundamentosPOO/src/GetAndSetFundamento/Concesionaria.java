package GetAndSetFundamento;

public class Concesionaria {
    public static void main(String[] args) {
        Carro fiat = new Carro();
        fiat.setMarca("Fiat");
        fiat.setModelo("Uno Turbo");
        fiat.setAno(1994);

        Carro nissan = new Carro();
        nissan.setMarca("Nissan");
        nissan.setModelo("GTR Skyline R32");
        nissan.setAno(1989);

        System.out.println("Carros disponíveis:\n"
        + "\nMarca: " + fiat.getMarca()+ "\nModelo: " + fiat.getModelo() + "\nAno: " + fiat.getAno()
        + "\n\nMarca: " + nissan.getMarca()+ "\nModelo: " + nissan.getModelo() + "\nAno: " + nissan.getAno());

    }
}
