package mensagens;

public class ServicoMensagemInstantanea {
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Mensagem enviada");
    salvarHistoricoMensagem();
  }

  public void receberMensagem(){
    System.out.println("Mensagem recebida");
  }

  private void validarConectadoInternet(){
    System.out.println("Verificando Conexão");
  }

  private void salvarHistoricoMensagem(){
    System.out.println("Salvando historico");
  }
}
