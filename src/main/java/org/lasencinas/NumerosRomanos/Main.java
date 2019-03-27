package org.lasencinas.NumerosRomanos;

public class Main {
	public static void main(String[] args) {
		String numeroRomano = "MDCCCLXXXVIII";
		int[] numericos;
		
		
		numericos = Romano.numerico(numeroRomano);
		
		String a="";
		for(int i = 0; i<numericos.length; i++) {
			a=a+numericos[i];
		}
		System.out.println("El número romano es: "+a);
		
		   
		
	}
}