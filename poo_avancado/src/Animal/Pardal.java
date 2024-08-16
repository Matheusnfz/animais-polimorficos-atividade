package Animal;

public class Pardal extends Ave {
	
	@Override
	public void emitirSom() {
		System.out.println("eu faço 'PI'");
		
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
