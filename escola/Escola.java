package escola;

public class Escola {
  public static void main(String[] args) {
      Aluno filipe = new Aluno();
      filipe.setNome("Filipe Junior");
      filipe.setIdade(12);

      System.out.println("O Aluno " + filipe.getNome() + " tem " + filipe.getIdade() + " anos." );
  }
}
