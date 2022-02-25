package src.main.java;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {
	public static void main(String[] args) {
		
		// Validando CPF
		String cpf = "86288366757";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("CPF INV�LIDO:" + e);
		}
		
		// Validando CNPJ
		String cnpj = "26291430000101";
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("CNPJ INV�LIDO:" + e);
		}
		
		// Validando T�tulo de Eleitor
		String tituloEleitor = "461845450485";
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("T�TULO DE ELEITOR V�LIDO");
		} catch (InvalidStateException e) {
			System.out.println("T�TULO DE ELEITOR INV�LIDO:" + e);
		}
	}
	
	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
	
}
