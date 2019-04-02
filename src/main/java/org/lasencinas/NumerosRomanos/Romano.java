package org.lasencinas.NumerosRomanos;


public enum Romano {
	
	CM (900),
	M  (1000),
	CD (400),
	D  (500),
	XC (90),
	C  (100),
	XL (40),
	L  (50),
	IX (9),
	X  (10),
	IV (4),
	V  (5),
	I  (1);
	
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
	
	public static int valorDelGrupo(String grupo) { //DEVUELVE EL VALOR DEL GRUPO
		
			for(Romano romano:Romano.values()) {
				if(grupo.equals(romano.name())) {
					return romano.getValor();
				}
			}
			
		return 0; // CASO ERROR
	}
	
	public static String sacarGrupos() { //CREA LOS GRUPOS AUTOMÁTICAMENTE EN BASE A LOS QUE HAYA EN EL ENUM
		String grupo = "";
		
		for(Romano romano:Romano.values()) {
			grupo = grupo + romano.name() + "|";
		}
		
		return grupo;
	}
	
}
