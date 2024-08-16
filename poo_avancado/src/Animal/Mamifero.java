package Animal;

public class Mamifero extends Animal {
	
	@Override
	public void emitirSom() {
		System.out.println("eu emito som");
		
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
	
	