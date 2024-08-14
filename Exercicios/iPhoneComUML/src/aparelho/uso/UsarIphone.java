package aparelho.uso;

import aparelho.aparelhoTelefonico.AparelhoTelefonico;
import aparelho.navegadarInternet.NavegarInternet;
import aparelho.reprodutorMusical.ReprodutorMusical;

public class UsarIphone implements AparelhoTelefonico, NavegarInternet, ReprodutorMusical{


//TELEFONE
    @Override
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("INICIANDO O CORREIO");
    }


//INTERNET
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA...");
    }


//MUSICA
    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("ESCOLHENDO MUSICA");
    }
    
}
