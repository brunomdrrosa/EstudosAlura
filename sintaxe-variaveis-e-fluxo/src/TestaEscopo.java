public class TestaEscopo {
  public static void main(String[] args) {
    System.out.println("Testando condicionais");
    int idade = 18;
    int quatidadePessoas = 3;
    boolean acompanhado;

    if (quatidadePessoas >= 2) {
      acompanhado = true;
    } else {
      acompanhado = false;
    }

    if (idade >= 18 || acompanhado) {
      System.out.println("Seja bem-vindo");
    } else {
      System.out.println("Infelizmente você não pode entrar");
    }
  }
}