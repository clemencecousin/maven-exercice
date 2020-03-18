package io.github.clemencecousin;

/**
 * The Class DiceUser.
 */
public class DiceUser {
	
	/**
	 * Roll the three dice once.
	 *
	 * @return the object triplet of dice generated
	 */
	public static TripletOfDice rollOnce() {
		return new TripletOfDice(6);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		TripletOfDice D = rollOnce();
		System.out.println(D.toString());
	}

}
