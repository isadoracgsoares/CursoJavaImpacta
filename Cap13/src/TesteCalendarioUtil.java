import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalendarioUtil {

	@Test
	void ano2020EhBissexto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(2020);
		assertTrue(resultado);
		
	}
	
	@Test
	void ano2021NãoEhBissextto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(2021);
		assertFalse(resultado);
	
	}
	
	@Test
	void ano400EhBissexto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(400);
		assertTrue(resultado);
	}
	
	@Test
	void ano200NãoEhBissexto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(200);
		assertFalse(resultado);
	}
	
	@Test
	void anoMenos400EhBissexto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(-400);
		assertFalse(resultado);
	}	
		
	@Test
	void anoZeroEhBissexto() {
		boolean resultado = CalendarioUtil.ehAnoBissexto(0);
		assertTrue(resultado);
	}
}
