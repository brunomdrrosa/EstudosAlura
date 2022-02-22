public class TestaMetodo {
  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.saldo = 100;
    conta.deposita(50);

    System.out.println(conta.saldo);
    conta.saca(180);
    System.out.println(conta.saldo);

    Conta contaDoBruno = new Conta();
    contaDoBruno.deposita(1000);

    if (contaDoBruno.transfere(1300, conta)) {
      System.out.println("Transferência concluída com sucesso");
    } else {
      System.out.println("Saldo insuficiente para transferência");
    }

    System.out.println(contaDoBruno.saldo);
    System.out.println(conta.saldo);

    contaDoBruno.titular = "Bruno Machado";
    System.out.println(contaDoBruno.titular);
  }
}
