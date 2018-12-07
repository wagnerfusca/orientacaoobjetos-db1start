package br.com.db1.db1start.heranca;

public class AnimalTest {

	public void exemploTest() {
		
		Galinha galinha = new Galinha();
		galinha.respirar();
		
		Animal galinha2 = new Galinha();
	
		Peixe peixe = new Peixe();
		peixe.respirar();
		peixe.nadar();
		
		Tilapia tilapia = new Tilapia();
		tilapia.nadar();
		tilapia.respirar();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
