

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import LabCap06.Calculadora;

class Teste {

	@Test
	void retorna10somando5com5() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(5, 5);
		assertTrue(resultado == 10);
		
	}
	
	@Test 
	void levantaExcecaoQuandoDivididoPorZero() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(5, 0);
		assertThrows(ArithmeticException.class, () ->{
			calc.dividir(5,0);
		});
	}
}
