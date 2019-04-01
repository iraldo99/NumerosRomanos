package org.lasencinas.NumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void encontrarPatron(String regex, String source) {
		Pattern patron = Pattern.compile(regex);
		Matcher comparador = patron.matcher(source);
		
		System.out.println("\nRegex: "+regex);
		System.out.println("Texto: "+source);
		
		boolean found = false;
		while(comparador.find()) {
			System.out.println("Texto encontrado: "+comparador.group()+
					", Start: "+comparador.start()+
					", End:"+comparador.end());
			found = true;
		}
		if(!found) {
			System.out.println("No se ha encontrado texto");
		}
	}
	
	public static void transformar(String numero) {
		
	}
	
	public static void main(String[] args) {
		String numeroRomano = "MDCCCLXXXVIII";
		String[] numRomanos = {"XLV","CDXCV","IV","XL","XIX","CCCXXXIV"};
		String[] numRumanos = {"VL","VD","IIII","XXXX","IXX","IVXLCDM"};
		
		
		
		Romano.transformar(numeroRomano);
		
		for(String a:numRomanos) {
			Romano.transformar(a);
		}
		for(String a:numRumanos) {
			Romano.transformar(a);
		}
		
		String regex = "[M]|[D]|[C]|[L]|[X]|[V]|[I]";
		String source = "MDCCCLXXXVIII";
		
		System.out.println();
		Romano.transformar(source);
		encontrarPatron(regex,source);
		
		transformar(numeroRomano);
		
		for(String a:numRomanos) {
			transformar(a);
		}
		for(String a:numRumanos) {
			transformar(a);
		}
		
	}
	
}