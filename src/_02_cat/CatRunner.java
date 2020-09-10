package _02_cat;

public class CatRunner {

	public static void main(String[] args) {
		Cat mat = new Cat("leo");	
		mat.meow();
		mat.printName();
		for (int i = 0; i < 9; i++) {
			mat.kill();
		}
		
		
	}
	
}
