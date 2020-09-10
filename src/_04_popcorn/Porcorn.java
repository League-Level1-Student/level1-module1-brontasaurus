package _04_popcorn;

public class Porcorn {

	public static void main(String[] args) {
		Microwave bowl = new Microwave();
		Popcorn jop = new Popcorn("butter");
		bowl.putInMicrowave(jop);
		bowl.setTime(2);
		bowl.startMicrowave();
		
		
	}
}
