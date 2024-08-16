package Animal;

public class Tartaruga extends Reptil {
	
	@Override
	public void emitirSom() {
		System.out.println("eu faço 'não sei'");
		
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
