/**
 * 
 */
package fr.dauphine.s4;

import java.util.Scanner;

/**
 * @author davau
 *
 */
public class EE57 {

	public static IntQuestion[] questions = { new AdditionQuestion(), new AdditionQuestion(), new AdditionQuestion(), new AdditionQuestion(),new AdditionQuestion(), new SubstractionQuestion(), new SubstractionQuestion(), new SubstractionQuestion(), new SubstractionQuestion(), new SubstractionQuestion() };
	public static int[] UserAnswers = new int[10];
	public static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startQuizz();
		getScore();
	}

	/**
	 * Administer the quiz
	 */
	public static void startQuizz() {
		sc = new Scanner(System.in);
		int ans = 0;
		System.out.println("---Welcome to easiest Quizz---");
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].getQuestion());
			try {
				ans = sc.nextInt();
				UserAnswers[i] = ans;
			} catch (Exception e) {
				System.out.println("Impossible answer, type again!");
				i--;
				sc = new Scanner(System.in);
			}

		}
		System.out.println("---Quizz End---");
		for (int i = 0; i < questions.length; i++) {
			System.out.println("Q" + (i + 1) + " : " + questions[i].getQuestion());
			System.out.println("Your answer : " + UserAnswers[i]);
			if (UserAnswers[i] != questions[i].getCorrectAnswer())
				System.out.println("False correct answer was : " + questions[i].getCorrectAnswer());
			else
				System.out.println("Correct !");
		}
	}

	/**
	 * Grade the quiz
	 */
	public static void getScore() {
		int score = 0;
		for (int i = 0; i < questions.length; i++) {
			if (UserAnswers[i] == questions[i].getCorrectAnswer())
				score += 10;
		}
		System.out.println("Your score is : " + score);
	}

}
