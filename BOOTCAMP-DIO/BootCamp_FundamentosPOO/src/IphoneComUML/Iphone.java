package IphoneComUML;

public class Iphone {
    public static void main(String[] args) {
        Navegador safari = new Navegador();
        ReprodutorMusical spotify = new ReprodutorMusical();
        Telefone phone = new Telefone();

        boolean ligado = false;
        int volume = 10;
        String url="", numero="71998394", musica="Creep - Radiohead";


        ligarAparelho(ligado);
        if (ligado = true) {
            safari.exibirPag(url);
            safari.adcPag();
            safari.atualizarPag();

            phone.atenderLigacao();
            phone.correioDeVoz();
            phone.fazerLigacao(numero);

            spotify.selecionarMusica(musica);
            spotify.pausar();
            spotify.play();
        }


    }
    public static void ligarAparelho(boolean ligado){
        System.out.println("Iphone ligado");
        ligado=true;
    }
    public static void desligarAparelho(boolean ligado){
        System.out.println("Iphone desligado");
        ligado=false;
    }

}
