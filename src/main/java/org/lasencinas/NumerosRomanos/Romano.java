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
	
	public static int[] numerico(String numero) {
		int[] numericos = new int[numero.length()];
		int i = 0;
		for(char c: numero.toCharArray()) {
			numericos[i] = letraANumeroDe(String.valueOf(c));
			i++;
		}
		
		return numericos;
	}
	
	public static int letraANumeroDe(String letra) {
		if(letra.length()==1) { // HA DE RECIBIR SOLO LETRAS (STRINGS DE TAMAÑO 1)
			for(Romano romano:Romano.values()) {
				if(letra.equals(romano.name())) {
					return romano.getValor();
				}
			}
		}
		
		return 0; // CASO ERROR, YA QUE TIENE QUE SER IGUAL A UNO DE ELLOS SÍ O SÍ
		
	}
	
	public static int calcula(int[] numerico) {
		
		int[] provisional;
		provisional = new int[numerico.length]; // AQUI SE GUARDARAN LOS NUMEROS CON SU VALOR (negativo o positivo)
		int resultado = 0; // AQUI SE IRA GUARDANDO EL RESULTADO DE SUMAR (O RESTAR) LOS VALORES DE provisional[]
		
		for(int i = 0; i<numerico.length; i++) {
			if( i==(numerico.length-1) ) { //COMPRUEBA QUE NO SEA EL ULTIMO NUMERO PARA NO PROVOCAR ERRORES DE SALIRSE DE LA ARRAY
				provisional[i]=numerico[i];
			}else {
				if(numerico[i]<numerico[i+1]) {
					provisional[i] = -numerico[i]; //LO CONVIERTE A NEGATIVO YA QUE EL SIGUIENTE NUMERO ES MAYOR
				}else{
					provisional[i] = numerico[i]; //LO DEJA EN POSITIVO YA QUE EL SIGUIENTE NUMERO ES MENOR O IGUAL
				}
			}
		}
		
		for (int i = 0; i<provisional.length; i++) {
			resultado = resultado + provisional[i];
		}
		
		return resultado;
	}
	
	public static String corregir(String numeroRomano) {
		String corregido = numeroRomano;  // WORK IN PROGRESS...
		
		return corregido;
	}
	
	public static void transformar(String numeroRomano) {
		String numeroRomanoBueno = corregir(numeroRomano);
		int[] numericos = numerico(numeroRomanoBueno);
		int resultado = calcula(numericos);
		System.out.println("El número romano "+numeroRomanoBueno+" en números decimales es "+resultado);
	}
	
	public static int transformarYDevolver(String numeroRomano) {
		String numeroRomanoBueno = corregir(numeroRomano);
		int[] numericos = numerico(numeroRomanoBueno);
		int resultado = calcula(numericos);
		return resultado;
	}
	
}
