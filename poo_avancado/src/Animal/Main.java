package Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Gato();
		Animal animal2 = new Pato();
		Animal animal3 = new Cobra();
		Animal animal4 = new Pardal();
		Animal animal5 = new Cachorro();
		Animal animal6 = new Tartaruga();
		
		
		
		animal.emitirSom();
		animal.locomover("20km");
		animal.locomover("Terra");
		
		animal2.emitirSom();
		animal2.locomover("60km");
		animal.locomover("Céu");
		
		
		animal3.emitirSom();
		animal3.locomover("6hm");
		animal3.locomover("Terra");
		
		animal4.emitirSom();
		animal4.locomover("60");
		animal4.locomover("Céu");
		
		animal5.emitirSom();
		animal5.locomover("30km");
		animal5.locomover("Terra");
		
		animal6.emitirSom();
		animal6.locomover("3km");
		animal6.locomover("Terra");
		
	}

}
