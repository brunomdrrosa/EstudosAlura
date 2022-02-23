public class TestaBanco {
  public static void main(String[] args) {
    Cliente bruno = new Cliente();
    bruno.nome = "Bruno Machado";
    bruno.cpf = "000.000.000-01";
    bruno.profissao = "Desenvolvedor";

    Conta contaDoBruno = new Conta();
    contaDoBruno.deposita(100);

    contaDoBruno.titular = bruno;
    System.out.println(contaDoBruno.titular.nome);
    System.out.println(contaDoBruno.titular);
  }
}
