import javax.print.attribute.SetOfIntegerSyntax;

public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;

    primeiraConta.saldo += 100;
    System.out.println(primeiraConta.saldo);

    Conta segundaConta = new Conta();
    segundaConta.saldo = 50;

    System.out.println("A primeira conta tem R$ " + primeiraConta.saldo);
    System.out.println("A segunda conta tem R$ " + segundaConta.saldo);

    System.out.println(primeiraConta.agencia);
    System.out.println(segundaConta.agencia);
    System.out.println(primeiraConta.numero);

    if (primeiraConta == segundaConta) {
      System.out.println("As contas são iguais");
    } else {
      System.out.println("As contas são diferentes");
    }

    System.out.println(primeiraConta);
    System.out.println(segundaConta);
  }
}
