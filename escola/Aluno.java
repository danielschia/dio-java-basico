package escola;

public class Aluno {
  private String nome;
  private int idade;
  private String sexo;

  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return idade;
  }
}
