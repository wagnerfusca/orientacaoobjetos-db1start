package br.com.db1.db1start.polimorfismo;

public class Cliente implements Autenticavel{

	@Override
	public String autenticar() {
		return "CLIENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
