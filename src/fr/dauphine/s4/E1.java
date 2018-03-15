/**
 * 
 */
package fr.dauphine.s4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author davau
 *
 */
public class E1 {

	/**
	 * @param args
	 * @see A class E1 that asks the end-user for a set of integer values. The user
	 *      enters 0 to stop entering values. Store these values in a Set of Integer
	 *      values (discarding duplicates). Do it again, obtaining a second set.
	 *      Then print each set of values entered, then the union of both sets. For
	 *      example, if the user enters 3, 4, 2, 0, then 1, 1, 2, 5, 0, it prints:
	 *      3, 4, 2, then 1, 2, 5, then 3, 4, 2, 1, 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lastNB = 0;
		int actualNB = 0;
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		System.out.println("---Welcome to Set II---");
		do {
			System.out.println("Enter an int to add to the set1 and 0 to end.");
			actualNB = sc.nextInt();
			if (actualNB == 0)
				break;
			if (lastNB != actualNB) {
				set1.add(actualNB);
			}
			lastNB = actualNB;
		} while (true);
		do {
			System.out.println("Enter an int to add to the set2 and 0 to end.");
			actualNB = sc.nextInt();
			if (actualNB == 0)
				break;
			if (lastNB != actualNB) {
				set2.add(actualNB);
			}
			lastNB = actualNB;
		} while (true);
		if (set1.size() != 0) {
			for (int e : set1) {
				System.out.print(e + " ");
			}
		}
		System.out.println("\n");
		if (set2.size() != 0) {
			for (int e : set2) {
				System.out.print(e + " ");
			}
		}
		System.out.println("\n");
		if (set1.size() == 0 && set2.size() == 0) {
			System.out.println("empty");
			System.exit(0);
		} else {
			for (int e : set2)
				if (!set1.contains(e))
					set1.add(e);
		}
		for (int e : set1) {
			System.out.print(e + " ");
		}
		sc.close();
	}

}
