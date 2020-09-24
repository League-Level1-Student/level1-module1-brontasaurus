package _06_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("*monotone* quack.");
	}
	void waddle() {
		System.out.println("*walks to Canada*");
	}
	
	public Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	}
	

