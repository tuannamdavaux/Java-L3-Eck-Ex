package fr.dauphine.s3;

/**
 * @author davau
 *
 */
public class PairOfDice {
	private int die1;
	private int die2;

	public PairOfDice() {
		this.roll();
	}

	public void roll() {
		// Roll the dice by setting each of the dice to be
		// a random number between 1 and 6.
		die1 = (int) (Math.random() * 6) + 1;
		die2 = (int) (Math.random() * 6) + 1;
	}

	public int getDie1() {
		return die1;
	}

	public int getDie2() {
		return die2;
	}

	@Override
	public String toString() {
		return "First die value : " + die1 + "; Second die value: " + die2;
	}

	public static void main(String[] args) {
		PairOfDice pod = new PairOfDice();
		int count = 0;
		do {
			pod.roll();
			count++;
		} while ((pod.die1 + pod.die2) != 2);
		System.out.println("nb of rolls to get snake eyes: " + count);
	}
	
}
