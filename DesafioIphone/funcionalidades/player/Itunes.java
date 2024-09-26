package funcionalidades.player;

public class Itunes implements ReprodutorMusical {
  public void tocar() {
    System.out.println("Tocando musica");
  }

  public void pausar() {
    System.out.println("Pausando");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando: " + musica);
  }
}
