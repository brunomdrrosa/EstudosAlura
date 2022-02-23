public class TesteFuncionario {
  public static void main(String[] args) {

    Gerente bruno = new Gerente();
    bruno.setNome("Bruno");
    bruno.setCpf("000.000.000-01");
    bruno.setSalario(1000.00);

    System.out.println(bruno.getNome());
    System.out.println(bruno.getBonificacao());
  }
}
