package lanchonete.atendimento.cozinha;

public class Cozinheiro {
  public void adicionarLancheNoBalcao(){
    System.out.println("Adicionando lanche natural no balcão");
  }

  public void adicionarSucoNoBalcao(){
    System.out.println("Adicionando suco no balcão");
  }

  public void adicionarComboNoBalcao(){
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche(){
    System.out.println("Preparando lanche tipo hamburguer");
  }

  private void prepararVitamina(){
    System.out.println("Preparando suco");
  }

  private void prepararCombo(){
    prepararVitamina();
    prepararLanche();
  }

  private void pedirIngredientes(Almoxarife almoxarife){
    almoxarife.entregarIngredientes();
  }

  private void pedirParaTrocarGas(Almoxarife meuAmigo){
    meuAmigo.trocarGas();
  }
}
