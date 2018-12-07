package br.com.db1.db1start.aula10;

import org.junit.Assert;
import org.junit.Test;

public class MinhaPrimeiraClasseTest {

	@Test
	public void testDivisao() {
		MinhaPrimeiraClasse classe = new MinhaPrimeiraClasse();
		Double resultado = classe.divisao(2D, 1D);
		Assert.assertTrue(2D == resultado);
		Assert.assertFalse(3D == resultado);
	}
	
	@Test
	public void testSomar() {
		MinhaPrimeiraClasse classe = new MinhaPrimeiraClasse();
		Integer resultado = classe.somar(2, 1);
		Assert.assertTrue(3 == resultado);
		Assert.assertEquals("2", classe.imprimirValor(2));
	}
	
	
}
