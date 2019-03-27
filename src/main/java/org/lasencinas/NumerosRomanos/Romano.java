package org.lasencinas.NumerosRomanos;

public enum Romano {
	
	I (1),
	V (5),
	X (10),
	L (50),
	C (100),
	D (500),
	M (1000);
	
	private int valor;
	
	private Romano (int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public static boolean check(String numero) {
		return true;
	}
	
	public static int[] numerico(String numero) {
		int[] numericos = new int[numero.length()];
		int i = 0;
		for(char c: numero.toCharArray()) {
			numericos[i] = valorDe(String.valueOf(c));
			i++;
		}
		
		return numericos;
	}
	
	public static int valorDe(String letra) {
		for(Romano romano:Romano.values()) {
			if(letra.equals(romano.name())) {
				return romano.getValor();
			}
		}
		return 0;// CASO ERROR, YA QUE TIENE QUE SER IGUAL A UNO DE ELLOS SÍ O SÍ
	}
	
}
