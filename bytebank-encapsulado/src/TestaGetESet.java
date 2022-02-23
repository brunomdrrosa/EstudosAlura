public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(1337, 24226);

    System.out.println(conta.getNumero());

    Cliente bruno = new Cliente();
    bruno.setNome("Bruno Machado");
    conta.setTitular(bruno);

    System.out.println(conta.getTitular().getNome());

    conta.getTitular().setProfissao("Desenvolvedor");
    System.out.println(conta.getTitular().getProfissao());
  }
}
