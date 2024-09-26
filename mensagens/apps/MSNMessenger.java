package mensagens.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Mensagem enviada pelo MSN");
  }
  public void receberMensagem() {
    System.out.println("Mensagem recebida pelo MSN");
  }
}
