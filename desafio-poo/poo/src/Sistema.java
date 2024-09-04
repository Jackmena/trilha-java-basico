
import aparelhos.Iphone;
import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Sistema {
    public static void main(String[] args) {
        Iphone apple = new Iphone();

        ReprodutorMusical reprodutorMusical = apple;
        AparelhoTelefonico aparelhoTelefonico = apple;
        NavegadorInternet navegadorInternet = apple;
        
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Evidências");

        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("http://testando");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }

}
