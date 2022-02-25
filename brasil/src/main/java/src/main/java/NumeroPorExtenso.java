package src.main.java;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	public static void main(String[] args) {
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
	    BigDecimal valor = new BigDecimal("75.59");
	    String valorPorExtenso = conversor.toWords(valor.doubleValue());
	    System.out.println(valorPorExtenso);
	}
}
