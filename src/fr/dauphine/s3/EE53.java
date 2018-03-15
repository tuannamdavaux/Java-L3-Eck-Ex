package fr.dauphine.s3;

public class EE53 {

	/**
	 * @param args
	 *            The program in Exercise 4.4 performs the experiment of counting
	 *            how many times a pair of dice is rolled before a given total comes
	 *            up. It repeats this experiment 10000 times and then reports the
	 *            average number of rolls, the standard deviation and maximum number
	 *            of rolls. It does this whole process for each possible total (2,
	 *            3, ..., 12).
	 */
	public static void main(String[] args) {
		PairOfDice dices = new PairOfDice();
		StatCalc rolls = new StatCalc();
		for (int i = 2; i <= 12; i++) {
			rolls = new StatCalc();
			for (int j = 0; j < 10000; j++) {
				rolls.enter(nbLancer(dices, i));
			}
			System.out.println("----------------------------------");
			System.out.println("Stats pour la somme de " + i + ": \n");
			System.out.println("Moyenne : " + rolls.getMean());
			System.out.println("Ecart type : " + rolls.getStandardDeviation());
			System.out.println("Maximum de jets : " + rolls.getMax());
			System.out.println("----------------------------------");
		}

	}

	/**
	 * @param pod
	 *            PairOfDice
	 * @param N
	 *            the wanted number
	 * @return Number of rolls to have n
	 */
	public static int nbLancer(PairOfDice pod, int n) {
		int count = 0;
		do {
			pod.roll();
			count++;
		} while ((pod.getDie1() + pod.getDie2()) != n);
		return count;
	}
}
