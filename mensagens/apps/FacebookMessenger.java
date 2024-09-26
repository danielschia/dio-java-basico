package mensagens.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Mensagem enviada pelo Facebook");
  }
  public void receberMensagem() {
    System.out.println("Mensagem recebida pelo Facebook");
  }
}
