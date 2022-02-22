public class TestaContaSemCliente {
  public static void main(String[] args) {
    Conta contaDeTeste = new Conta();
    System.out.println(contaDeTeste.getSaldo());

    contaDeTeste.titular = new Cliente();
    System.out.println(contaDeTeste.titular);

    contaDeTeste.titular.nome = "Lorem Ipsum";
    System.out.println(contaDeTeste.titular.nome);
  }
}
