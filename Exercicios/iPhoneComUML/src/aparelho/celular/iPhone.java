package aparelho.celular;

import aparelho.uso.UsarIphone;

public class iPhone {

    public static void main(String[] args) {
        UsarIphone usar = new UsarIphone();

    //INTERNET
        System.out.println("INTERNET");
        usar.adicionarNovaAba();
        usar.exibirPagina();
        usar.atualizarPagina();

    //MUSICA
        System.out.println("MUSICA");
        usar.selecionarMusica();
        usar.tocar();
        usar.pausar();

    //TELEFONE
        System.out.println("TELEFONE");
        usar.ligar();
        usar.atender();
        usar.iniciarCorreio();
        
    }
    
}
