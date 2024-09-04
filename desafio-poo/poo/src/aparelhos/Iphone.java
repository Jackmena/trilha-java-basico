package aparelhos;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("TOCANDO");
    }

    public void pausar(){
        System.out.println("PAUSANDO");
    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONADO A MUSICA " + musica);
    }

    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NUMERO " + numero);
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    } 
}
