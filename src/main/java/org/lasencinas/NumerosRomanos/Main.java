package org.lasencinas.NumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static int valorDecimal(String numero) {
		String grupo = Romano.sacarGrupos();
		Pattern patron = Pattern.compile(grupo);
		Matcher comparacion = patron.matcher(numero);
		
		int total = 0;
		
		while(comparacion.find()) { //SUMA LOS VALORES DE TODOS LOS GRUPOS QUE ENCUENTRE
			total = total + Romano.valorDelGrupo(comparacion.group());
		}
		return total;
	}
	
	public static void main(String[] args) {
		String numeroRomano = "MDCCCLXXXVIII";
		
		System.out.println("El valor de "+numeroRomano+" es "+valorDecimal(numeroRomano)+".");
		
	}
	
}