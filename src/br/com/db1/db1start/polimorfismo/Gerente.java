package br.com.db1.db1start.polimorfismo;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		for (int x = 0; x < 10; x++) {
			System.out.println("" + x);
		}
		return "Gerente AUTENTICANDO";

	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
