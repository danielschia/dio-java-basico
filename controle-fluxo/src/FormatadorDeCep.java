

public class FormatadorDeCep {
  public static void main(String[] args) {
    try {
      String CepFormatado = formatarCep("2376506");
      System.out.println(CepFormatado);
    } catch (CepInvalidoException e) {
      // TODO Auto-generated catch block
      System.out.println("O CEP não corresponde com as regras de negócio");
    }
  }
  static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8 )
    throw new CepInvalidoException();

    return "23.765-064";
  }
}
