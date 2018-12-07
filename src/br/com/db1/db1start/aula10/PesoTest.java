package br.com.db1.db1start.aula10;

import org.junit.Assert;
import org.junit.Test;



public class PesoTest {
	@Test
	public void testar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("fusca");
		Assert.assertEquals("fusca", pessoa.getNome());
	}

}
