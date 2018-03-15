package fr.dauphine.s3;

import java.util.Scanner;

public class StatCalc {
	private int count; // Number of numbers that have been entered.
	private double sum; // The sum of all the items that have been entered.
	private double squareSum; // The sum of the squares of all the items.
	private double max;
	private double min;

	/**
	 * Add a number to the dataset. The statistics will be computed for all the
	 * numbers that have been added to the dataset using this method.
	 */
	public void enter(double num) {
		count++;
		sum += num;
		squareSum += num * num;
		if (count == 1) {// Ceci est le premier nombre.
			max = num;
			min = num;
		} else {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
	}

	/**
	 * Return the number of items that have been entered into the dataset.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the sum of all the numbers that have been entered.
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * Return the average of all the items that have been entered. The return value
	 * is Double.NaN if no numbers have been entered.
	 */
	public double getMean() {
		return sum / count;
	}

	/**
	 * Return the standard deviation of all the items that have been entered. The
	 * return value is Double.NaN if no numbers have been entered.
	 */
	public double getStandardDeviation() {
		double mean = getMean();
		return Math.sqrt(squareSum / count - mean * mean);
	}

	/**
	 * @return max number entered
	 */
	public double getMax() {
		return max;

	}

	/**
	 * @return min number entered
	 */
	public double getMin() {
		return min;
	}

	public static void main(String[] args) {
		StatCalc calc; // Objet � utiliser pour traiter les donn�es.
		calc = new StatCalc();
		Scanner sc = new Scanner(System.in);
		double nb = 0;
		System.out.println("Entrez des nombres non nuls sinon fin !");
		while (true) {
			System.out.println("Entrez un nombre : ");
			nb = sc.nextDouble();
			if (nb != 0)
				calc.enter(nb);
			else {
				if (calc.count == 0) {
					System.out.println("Aucune donn�e valide ! Fin de prog.");
					System.exit(0);
				}
				System.out.println("Fin du prog");
				System.out.println("Nb d'�l�ments entr�s : " + calc.getCount());
				System.out.println("Somme des �l�ments entr�s : " + calc.getSum());
				System.out.println("Moyenne des �l�ments entr�s : " + calc.getMean());
				System.out.println("Ecart type d'�l�ments entr�s : " + calc.getStandardDeviation());
				System.out.println("Maximum des �l�ments entr�s : " + calc.getMax());
				System.out.println("Minimum des �l�ments entr�s : " + calc.getMin());
				System.exit(0);
			}
			sc.close();
		}

	}

}
