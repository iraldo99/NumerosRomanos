package org.lasencinas.NumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String numeroRomano = "MDCCCLXXXVIII";
		String[] numRomanos = {"XLV","CDXCV","IV","XL","XIX","CCCXXXIV"};
		String[] numRumanos = {"VL","VD","IIII","XXXX","IXX","IVXLCDM"};
		String basico = "V";
		
		
		Romano.transformar(numeroRomano);
		
		for(String a:numRomanos) {
			Romano.transformar(a);
		}
		for(String a:numRumanos) {
			Romano.transformar(a);
		}
		
		String regex = "V";
		String source = basico;
		
		findPattern(regex,basico);
		
	}
	public static void findPattern(String regex, String source) {
		Pattern patron = Pattern.compile(regex);
		Matcher comparador = patron.matcher(source);
		
		System.out.println("\nRegex: "+regex);
		System.out.println("Text: "+source);
		
		boolean found = false;
		while(comparador.find()) {
			System.out.println("Texto encontrado: ");
		}
	}
}