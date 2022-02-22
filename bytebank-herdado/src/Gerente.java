// Gerente é um funcionário, ele herda da classe Funcionario
public class Gerente extends Funcionario {

  // Ao herdar, a classe filha ganha todas as características (atributos)
  // e todas as funcionalidades (métodos) da classe mãe
  private int senha;

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public boolean autentica(int senha) {
    if (this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }

  // O super é similiar ao this, mas indica que é um atributo da classe mãe
  public double getBonificacao() {
    return super.getBonificacao() + super.getSalario();
  }
}
