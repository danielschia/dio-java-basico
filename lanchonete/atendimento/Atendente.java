package lanchonete.atendimento;

public class Atendente {
  public void servindoMesa(){
    pegarLancheCozinha();
    System.out.println("Servindo a mesa");
  };

  private void pegarLancheCozinha(){
    System.out.println("Pegando lanche na cozinha");
  };

  public void receberPagamento(){
    System.out.println("Recebendo pagamento");
  }

  void pegarPedidoBalcao(){
    System.out.println("Pegando pedido no balcão");
  }

  void trocarGas(){
    System.out.println("Atendente trocando o gás");
  }
}
