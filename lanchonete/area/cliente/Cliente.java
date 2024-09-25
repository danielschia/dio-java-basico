package lanchonete.area.cliente;

public class Cliente {
  public void escolherLanche(){
    System.out.println("Escolhendo Lanche");
  }

  public void fazerPedido(){
    System.out.println("Fazendo Pedido");
  }

  public void pagarConta(){
    ConsultarSaldoAplicativo();
    System.out.println("Pagando Conta");
  }

  private void ConsultarSaldoAplicativo(){
    System.out.println("Consultando saldo no aplicativo");
  }
}
