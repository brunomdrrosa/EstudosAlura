public class TesteFuncionario {
  public static void main(String[] args) {

    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Bruno");
    funcionario.setCpf("000.000.000-01");
    funcionario.setSalario(1000.00);

    System.out.println(funcionario.getNome());
    System.out.println(funcionario.getBonificacao());
  }
}
