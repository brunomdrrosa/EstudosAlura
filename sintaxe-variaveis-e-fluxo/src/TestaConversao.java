
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		// Imprime 1270
		System.out.println(valor);
				
		// Valor máximo que pode ser utilizado no byte
		byte maximoValorByte = 127;
		// (2 elevado a 7) - 1
		System.out.println(maximoValorByte);
		
		// Valor máximo que pode ser utilizado no short
		short maximoValorShort = 32767;
		// (2 elevado a 15) - 1
		System.out.println(maximoValorShort);
		
		/* Valor máximo que pode ser utilizado no int
		a partir do 2147483648, é necessário utilizar
		o tipo de variável long */
		int maximoValorInt = 2147483647;
		// (2 elevado a 31) - 1
		System.out.println(maximoValorInt);
		
		long numeroGrande = 2147483648L;
		System.out.println(numeroGrande);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		// Imprime 0.30000000000000004
		System.out.println(total);		
	}
}
