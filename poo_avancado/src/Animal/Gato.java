package Animal;

public class Gato extends Mamifero {
	
	@Override
	public void emitirSom() {
		System.out.println("eu faço 'miau'");
		
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
