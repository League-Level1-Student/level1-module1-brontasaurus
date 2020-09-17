package _05_vault;

public class BondJamesBondBond {

	public static int findCode(Vault vault) {
		System.out.println("HACKING");
		for (int i=0; i<Integer.MAX_VALUE; i++) {
			if (i%1000 == 0) {
				System.out.print(".");
			}
			if(vault.tryCode(i)) {
				return i;
			}
		}
		System.out.println("yup sorry it's not a number these people actually know what they're doing.");
		return -666;
	}
	
	public static void main(String[] args) {
		
	Vault cityBank = new Vault();
	System.out.println(findCode(cityBank));
		
	}

	
	
}
