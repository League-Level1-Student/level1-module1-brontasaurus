package _06_duck;

public class Cowjumper {

	public static void main(String[] args) {
		
		Duck BugsBunny = new Duck("donuts",5);
		BugsBunny.quack();
		BugsBunny.waddle();
		
		Cow CowBus = new Cow(34,4);
		CowBus.eat();
		CowBus.standInOnePlaceUntilThereIsNoMoreFood();
		
	}
	
}
