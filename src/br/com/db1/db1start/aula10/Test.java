package br.com.db1.db1start.aula10;

import br.com.db1.db1start.composicao.Bacon;
import br.com.db1.db1start.composicao.Feijao;
import br.com.db1.db1start.composicao.Feijoada;

public class Test {

	@org.junit.Test
	public void test() {
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		Recibo recibo2 = new Recibo(pessoa);
		
		Feijoada feijoada = 
				new Feijoada(new Feijao(), new Bacon());
		
	}
}
