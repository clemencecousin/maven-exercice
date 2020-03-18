package io.github.clemencecousin;

/**
 * The Class TripletOfDice.
 */
public class TripletOfDice {
	/** The die 1. */
	private int die1;
	
	/** The die 2. */
	private int die2;
	
	/** The die 3. */
	private int die3;
	
	/**  The number of sides of the three dice. */
	private int numberofsides;
	
	/**
	 * Instantiates a new triplet of dice.
	 *
	 * @param numberofsides the number of sides of each dice.
	 * Constructors should always be call with a parameters
	 */
	TripletOfDice(int numberofsides){
		this.die1 = (int) (Math.random()*numberofsides + 1);
		this.die2 = (int) (Math.random()*numberofsides + 1);
		this.die3 = (int) (Math.random()*numberofsides + 1);
		this.numberofsides = numberofsides;
	}
	
	/**
	 * Roll all dice.
	 */
	public void rollAllDice() {
		this.die1 = (int) (Math.random()*this.numberofsides + 1);
		this.die2 = (int) (Math.random()*this.numberofsides + 1);
		this.die3 = (int) (Math.random()*this.numberofsides + 1);
	}
	
	/**
	 * Roll one dice.
	 *
	 * @param dieNumber the number of the die you want to roll
	 */
	public void rollOneDice(int dieNumber) {
		switch (dieNumber) {
		case 1:
			this.die1 = (int) (Math.random()*this.numberofsides + 1);
			break;
		case 2 :
			this.die2 = (int) (Math.random()*this.numberofsides +1);
			break;
		case 3:
			this.die3 = (int) (Math.random()*this.numberofsides + 1);
			break;
		default:
			throw new IllegalArgumentException("You need to use a number between 1 and 3 as a parameter");
		}
	}
	
	/**
	 * Gets the value of the first dice.
	 *
	 * @return the value of the first dice
	 */
	public int getFirstDice() {
		return this.die1;
	}
	
	/**
	 * Gets the value of the second dice.
	 *
	 * @return the value of the second dice
	 */
	public int getSecondDice() {
		return this.die2;
	}
	
	/**
	 * Gets the value of the third dice.
	 *
	 * @return the value of the third dice
	 */
	public int getThirdDice() {
		return this.die3;
	}
	
	/**
	 * Allows to have the result of one roll.
	 *
	 * @return a string
	 */
	public String toString() {
		return ("The die number one is a " + this.getFirstDice() + "\nThe die number two is a " + this.getSecondDice() + "\nThe die number three is a " + this.getThirdDice());
	}
}
