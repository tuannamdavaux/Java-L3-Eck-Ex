/**
 * 
 */
package fr.dauphine.s4;

/**
 * @author davau
 *
 */
public class SubstractionQuestion implements IntQuestion {
	private int a, b; // The numbers in the problem.

	public SubstractionQuestion() { // constructor
		do {
			a = (int) (Math.random() * 50 + 1);
			b = (int) (Math.random() * 50);

		} while (a-b<0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dauphine.s4.IntQuestion#getQuestion()
	 */
	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return "What is " + a + " - " + b + " ?";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dauphine.s4.IntQuestion#getCorrectAnswer()
	 */
	@Override
	public int getCorrectAnswer() {
		// TODO Auto-generated method stub
		return a-b;
	}

}
