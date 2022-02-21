
public class TestaCaracteres {

	public static void main(String[] args) {
		// Só funciona com 1 caractere e aspas simples
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		// Imprime B (Tabela ASCII)
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		// Imprime C
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra = palavra + 2022;
		System.out.println(palavra);
	}

}
