package org.lasencinas.NumerosRomanos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RomanosTest {
	
	@Test
	public void elGrupoVEsIgualA5() {
		String grupo = "V";
		assertEquals("El valor de V es 5",5, Romano.valorDelGrupo(grupo));
	}
	@Test
	public void valorDelGrupoTest() {
		String grupo = "I";
		assertEquals("El valor de I es 1",1, Romano.valorDelGrupo(grupo));
		grupo = "X";
		assertEquals("El valor de x es 10",10, Romano.valorDelGrupo(grupo));
		grupo = "L";
		assertEquals("El valor de L es 50",50, Romano.valorDelGrupo(grupo));
		grupo = "CD";
		assertEquals("El valor de CD es 400",400, Romano.valorDelGrupo(grupo));
		grupo = "IV";
		assertEquals("El valor de IV es 4",4, Romano.valorDelGrupo(grupo));
	}
	
	@Test
	public void sacarGruposTest() {
		assertTrue("El grupo debe ser exactamente igual al enum Romano en orden",
				Romano.sacarGrupos().equals("CM|M|CD|D|XC|C|XL|L|IX|X|IV|V|I|"));
	}

}
