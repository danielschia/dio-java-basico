package mensagens;

public class FacebookMessenger extends ServicoMensagemInstantanea {

  public void enviarMensagem() {
    System.out.println("Mensagem enviada pelo Facebook");
  }
  public void receberMensagem() {
    System.out.println("Mensagem recebida pelo Facebook");
  }
}
