package usuario;

import funcionalidades.iphone.Iphone;

public class Usuario {
  public static void main(String[] args) {
      Iphone iphone = new Iphone();
      iphone.exibirPagina("www.google.com");
      iphone.atender();
      iphone.selecionarMusica("Milton Nascimento - Cais");
  }
}
