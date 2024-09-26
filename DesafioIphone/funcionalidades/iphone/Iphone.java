package funcionalidades.iphone;

import funcionalidades.internetBrowser.NavegadorInternet;
import funcionalidades.player.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
  public void exibirPagina(String url){
    System.out.println("Exibindo a página: " + url + " no navegador do Iphone");
  }

  public void adicionarNovaAba(){
    System.out.println("Adicionando nova aba no navegador do Iphone");
  }

  public void atualizarPagina(){
    System.out.println("Atualizando a página no navegador do Iphone");
  }

  public void tocar() {
    System.out.println("Tocando musica no Itunes do Iphone");
  }

  public void pausar() {
    System.out.println("Pausando musica no Itunes do Iphone");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando: " + musica + " no Itunes do Iphone");
  }

  public void ligar(String numero){
    System.out.println("Ligando para: " + numero + " pelo dispositivo Iphone");
  }

  public void atender(){
    System.out.println("Atendendo pelo dispositivo Iphone");
  }

  public void iniciarCorreioVoz(){
    System.out.println("Iniciando correio de voz pelo dispositivo Iphone");
  }
}
