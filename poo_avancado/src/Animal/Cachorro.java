package Animal;

public class Cachorro extends Mamifero {
	
	@Override
	public void emitirSom() {
		System.out.println("eu faço 'auau'");
		
	}

	@Override
	public void locomover(int velocidade) {
		System.out.println("Eu corro" + velocidade + "km/h"); 
		
	}

	@Override
	public void locomover(String terreno) {
		System.out.println("Eu ando no"+ terreno);
	}

}
