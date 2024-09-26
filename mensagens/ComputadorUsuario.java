package mensagens;

public class ComputadorUsuario {
  public static void main(String[] args) {
      MSNMessenger msn = new MSNMessenger();
      System.out.println("MSN");
      msn.receberMensagem();
      msn.enviarMensagem();

      FacebookMessenger fb = new FacebookMessenger();
      System.out.println("Facebook");
      fb.receberMensagem();
      fb.enviarMensagem();

      Telegram telegram = new Telegram();
      System.out.println("Telegram");
      telegram.receberMensagem();
      telegram.enviarMensagem();
  }
}
