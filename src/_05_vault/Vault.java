package _05_vault;

import java.util.Random;

public class Vault {

	int secretCode;
	boolean tryCode(int sour) {
		if (secretCode == sour) {
			
			System.out.println("\n you're in, the vault has been opened");
			return true;
		}
		else {
			//System.out.println("your hacking skills suck. I recomend getting another job");
			return false;
		}
	}
	
		public Vault(){
		Random grapes = new Random();
		secretCode = grapes.nextInt(1000000);
		
		
		
	}
	
	

}
