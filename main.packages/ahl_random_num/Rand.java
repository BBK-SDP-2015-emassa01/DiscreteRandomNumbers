package ahl_random_num;

public interface Rand {

	/**
	 * Returns one of the randomNums. When this method is called multiple times over
	 * a long period, it should return the numbers roughly with the initialized
	 * probabilities.
	 */
	public int nextNum();
	
}
