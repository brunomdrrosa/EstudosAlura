public class TesteArrayPrimitivos {
  public static void main(String[] args) {

    int[] idades = new int[5];

    idades[0] = 19;
    idades[1] = 29;
    idades[2] = 39;
    idades[3] = 49;
    idades[4] = 59;

    int idade1 = idades[4];

    System.out.println(idade1);
    System.out.println(idades.length);

    for(int i = 0; i < idades.length; i++){
      System.out.println(idades[i]);
    }
    
  }
}
