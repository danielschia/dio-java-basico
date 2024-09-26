package mensagens;

import mensagens.apps.FacebookMessenger;
import mensagens.apps.MSNMessenger;
import mensagens.apps.ServicoMensagemInstantanea;
import mensagens.apps.Telegram;

public class ComputadorUsuario {
  public static void main(String[] args) {
     ServicoMensagemInstantanea smi = null;

     String appEscolhido = "Telegram";

     if(appEscolhido.equals("MSN")){
       smi = new MSNMessenger();
     } else if(appEscolhido.equals("Facebook Messenger")){
       smi = new FacebookMessenger();
     } else if(appEscolhido.equals("Telegram")){
       smi = new Telegram();
     } else {
       System.out.println("App não encontrado");
     }

     smi.enviarMensagem();
     smi.receberMensagem();

     // TODO: Implementar o historico de mensagens
     // public abstract void salvarHistoricoMensagem();
  }
}
