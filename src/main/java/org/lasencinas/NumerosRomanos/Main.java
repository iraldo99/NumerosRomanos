package org.lasencinas.NumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static String grupo = "CM|M|CD|D|XC|C|XL|L|IX|X|IV|V|I|";
	public static Pattern patron = Pattern.compile(grupo);
	
	public static int valorDecimal(String numero) {
		Matcher comparacion = patron.matcher(numero);
		int total = 0;
		while(comparacion.find()) {
			total = total + Romano.valorDelGrupo(comparacion.group());
		}
		return total;
	}
	
	public static void main(String[] args) {
		String numeroRomano = "MDCCCLXXXVIII";
		
		System.out.println("El valor de "+numeroRomano+" es "+valorDecimal(numeroRomano)+".");
		
	}
	
}