
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("O salário é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		// Imprime 2 ao invés de 2.5 
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2;
		// Imprime 2.0 ao invés de 2.0
		System.out.println(novaTentativa);
		
		double maisUmaTentativa = 5.0 / 2;
		// Imprime 2.5
		System.out.println(maisUmaTentativa);
	}
}
